/*
     This file is part of DUP.
     (C) 2008 The DUP team

     DUP is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published
     by the Free Software Foundation; either version 2, or (at your
     option) any later version.

     DUP is distributed in the hope that it will be useful, but
     WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
     General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with DUP; see the file COPYING.  If not, write to the
     Free Software Foundation, Inc., 59 Temple Place - Suite 330,
     Boston, MA 02111-1307, USA.
*/
#include "commsim.h"

using namespace commsim;
using namespace fides;
using namespace std;

/*
 * Order methods
 */

Order::Order (const string & item, unsigned int quantity, const string & deliverTo):m_item (item), m_quantity (quantity),
m_deliverTo
(deliverTo)
{
  ostringstream
    oss;
  oss << random ();
  m_orderId = oss.str ();
}

Order::Order (const Event & event):
m_item (event.getValue ("item")),
m_orderId (event.getValue ("orderId")),
m_quantity (strtoul (event.getValue ("quantity").c_str (), NULL, 10)),
m_deliverTo (event.getValue ("deliverTo"))
{
  if (event.getEventName () != "Order")
    {
      FIDES_THROW (logic_error,
                   "attempt to construct an Order from a non-Order event: " <<
                   event.getEventName ());
    }
  if (m_item.length () == 0 || m_orderId.length () == 0 || m_quantity == 0
      || m_deliverTo.length () == 0)
    {
      FIDES_THROW (logic_error,
                   "Order event does not have the necessary items: " <<
                   event);
    }
}

Order::Order (const Order & that):
m_item (that.m_item),
m_orderId (that.m_orderId),
m_quantity (that.m_quantity),
m_deliverTo (that.m_deliverTo)
{
}

const string &
Order::getItem () const
{
  return m_item;
}

const string &
Order::getOrderId () const
{
  return m_orderId;
}

unsigned int
Order::getQuantity () const
{
  return m_quantity;
}

const string &
Order::getDeliverTo () const
{
  return m_deliverTo;
}

string
Order::str () const
{
  ostringstream oss;
  oss << "[Order: item=" << m_item << ",orderId="
    << m_orderId << ",quantity=" << m_quantity << ",deliverTo="
    << m_deliverTo << "]";
  return oss.str ();
}

Event
Order::event () const
{
  Event event ("Order");
  event.addValue ("item", m_item);
  event.addValue ("orderId", m_orderId);
  event.addValue ("deliverTo", m_deliverTo);

  ostringstream oss;
  oss << m_quantity;
  event.addValue ("quantity", oss.str ());
  return event;
}

/*
 * Delivery methods
 */

Delivery::Delivery (const string & item, const string & orderId, unsigned int quantity):m_item (item), m_orderId (orderId),
m_quantity
(quantity)
{
}

Delivery::Delivery (const Delivery & that):
m_item (that.m_item),
m_orderId (that.m_orderId),
m_quantity (that.m_quantity)
{
}

Delivery::Delivery (const Event & event):
m_item (event.getValue ("item")),
m_orderId (event.getValue ("orderId")),
m_quantity (strtoul (event.getValue ("quantity").c_str (), NULL, 10))
{
  if (event.getEventName () != "Delivery")
    {
      FIDES_THROW (logic_error,
                   "attempt to construct a Delivery from a non-Delivery event: "
                   << event.getEventName ());
    }
}

const string &
Delivery::getItem () const
{
  return m_item;
}

const string &
Delivery::getOrderId () const
{
  return m_orderId;
}

unsigned int
Delivery::getQuantity () const
{
  return m_quantity;
}

string
Delivery::str () const
{
  ostringstream oss;
  oss << "[Delivery: item=" << m_item << ",orderId="
    << m_orderId << ",quantity=" << m_quantity << "]";
  return oss.str ();
}

Event
Delivery::event () const
{
  Event event ("Delivery");
  event.addValue ("item", m_item);
  event.addValue ("orderId", m_orderId);

  ostringstream oss;
  oss << m_quantity;
  event.addValue ("quantity", oss.str ());
  return event;
}

/*
 * Manufacturer methods
 */

Manufacturer::Manufacturer (SimulationEngine& engine, const string & processName):Process (engine, processName)
{
}

void
Manufacturer::addItem (const string & item, unsigned int delay)
{
  FIDES_DEBUG ("adding " << item << "->" << delay << " to map");
  m_delayMap.insert (make_pair (item, delay));
}

void
Manufacturer::processEvent (const Event & event)
{
  if (event.getEventName () != "Order")
    {
      FIDES_THROW (invalid_argument,
                   "manufacturer received unexpected event: " << event.
                   getEventName ());
    }
  // Order event has: item, orderId, quantity, and deliverTo
  Order order (event);

  if (m_delayMap.find (order.getItem ()) == m_delayMap.end ())
    {
      FIDES_THROW (logic_error,
                   "manufacturer received an order for an item that it does not produce: "
                   << order.getItem ());
    }

  unsigned int delay = m_delayMap[order.getItem ()];

  FIDES_DEBUG ("Manufacturer(" << getProcessName () << ") received: " <<
               order.str ());
  Delivery d (order.getItem (), order.getOrderId (), order.getQuantity ());

  scheduleEvent (order.getDeliverTo (), delay, d.event ());
}


/*
 * Retailer methods
 */
Retailer::Retailer (SimulationEngine& engine, const string & processName):
  Process (engine, processName)
{
}

void
Retailer::processEvent (const Event & e)
{
  FIDES_DEBUG ("processing event: " << e);
  if (e.getEventName () == "Delivery")
    {
      Delivery d (e);
      handleDelivery (d);
    }
  else if (e.getEventName () == "Order")
    {
      Order o (e);
      handleOrder (o);
    }
  else
    {
      FIDES_THROW (logic_error,
                   "Retailer(" << getProcessName () <<
                   ") received unknown event: " << e.getEventName ());
    }
}

void
Retailer::addItem (const string & item, const string & manufacturer,
                   unsigned int unit)
{
  FIDES_DEBUG ("Retailer(" << getProcessName () << ") -> orders " << item <<
               " in quantities of " << unit << "(s)");
  item_count ic;
  ic.manufacturer = manufacturer;
  ic.unit = unit;
  ic.stock = 0;
  ic.held = 0;
  ic.ordered = 0;
  ic.claimed = 0;
  m_stockMap[item] = ic;
}

void
Retailer::handleDelivery (const Delivery & del)
{
  item_count ic = m_stockMap[del.getItem ()];
  unsigned int q_delivered = del.getQuantity ();

  FIDES_DEBUG ("Retailer(" << getProcessName () << ") received: " << del.
               str ());
  FIDES_DEBUG ("Retailer(" << getProcessName () << ") s=" << ic.
               stock << " h=" << ic.held << " c=" << ic.
               claimed << " o=" << ic.ordered);

  // a delivery of X widgets arrived, we need to combine with
  // the widgets that are being held and start sending deliveries
  // out to the buyer.
  ic.ordered -= q_delivered;

  queue < Order > &oqRef = m_pendingOrders[del.getItem ()];
  queue < Order > newQ;
  while (!oqRef.empty ())
    {
      Order ord = oqRef.front ();
      oqRef.pop ();

      unsigned int q_needed = ord.getQuantity ();

      // if the combination of items in stock, being held, and just
      // delivered is enough to fulfill this order...
      if ((ic.stock + ic.held + q_delivered) >= q_needed)
        {
          Delivery del (ord.getItem (), ord.getOrderId (),
                        ord.getQuantity ());
          scheduleEvent (ord.getDeliverTo (), 1, del.event ());

          // now have to account for it, first from held
          q_needed -= ic.held;
          if (q_needed < 0)
            {
              ic.held = -1 * q_needed;
              q_needed = 0;
            }
          else
            {
              ic.held = 0;
            }

          if (q_needed != 0)
            {
              // second from stock
              q_needed -= ic.stock;
              if (q_needed < 0)
                {
                  ic.stock = -1 * q_needed;
                  q_needed = 0;
                }
              else
                {
                  ic.stock = 0;
                }

              if (q_needed != 0)
                {
                  // third from delivery
                  if (q_delivered < q_needed)
                    {
                      FIDES_THROW (logic_error, "q_needed=" << q_needed);
                    }

                  q_delivered -= q_needed;
                  ic.claimed -= q_needed;
                }
            }
        }
      else
        {                       // we can't fulfill the order yet
          newQ.push (ord);
        }
    }
  m_pendingOrders[del.getItem ()] = newQ;

  // if q_delivered is still positive, it goes into stock
  if (q_delivered < 0)
    {
      FIDES_THROW (logic_error, "q_delivered is negative");
    }
  ic.stock += q_delivered;

  FIDES_DEBUG ("Retailer(" << getProcessName () << ") s=" << ic.
               stock << " h=" << ic.held << " c=" << ic.
               claimed << " o=" << ic.ordered);
  m_stockMap[del.getItem ()] = ic;
}

void
Retailer::handleOrder (const Order & ord)
{
  /*
   * an order was received by this retailer, it needs to
   * check if it can fulfill the order out of stock. If
   * not, it needs to order the difference, and put
   * the order in a holding area until it gets delivery.
   */
  unsigned int q_needed = ord.getQuantity ();
  item_count ic = m_stockMap[ord.getItem ()];

  FIDES_DEBUG ("Retailer(" << getProcessName () << ") received: " << ord.
               str ());
  FIDES_DEBUG ("Retailer(" << getProcessName () << ") s=" << ic.
               stock << " h=" << ic.held << " c=" << ic.
               claimed << " o=" << ic.ordered << " q=" << q_needed);
  if (ic.stock >= q_needed)
    {
      Delivery del (ord.getItem (), ord.getOrderId (), q_needed);
      scheduleEvent (ord.getDeliverTo (), 1, del.event ());
      ic.stock -= q_needed;
    }
  else
    {
      // move the ones in stock to held
      q_needed -= ic.stock;
      ic.held += ic.stock;
      ic.stock = 0;

      // need to wait for a delivery
      // method returns.
      m_pendingOrders[ord.getItem ()].push (ord);
      ic.claimed += q_needed;

      FIDES_DEBUG ("Retailer(" << getProcessName () << ") s=" << ic.
                   stock << " h=" << ic.held << " c=" << ic.
                   claimed << " o=" << ic.ordered << " q=" << q_needed);
      // if there aren't already enough on order, generate an order for
      // the difference
      if (ic.claimed > ic.ordered)
        {
          unsigned int q = ic.claimed - ic.ordered;

          FIDES_DEBUG ("Need to order: " << q << " of " << ord.getItem ());
          // make sure we are ordering in the right size chunks
          if ((q % ic.unit) != 0)
            {
              q += ic.unit - (q % ic.unit);
            }

          FIDES_DEBUG ("Order size will be: " << q << " of " << ord.
                       getItem ());
          Order ord2 (ord.getItem (), q, getProcessName ());
          scheduleEvent (ic.manufacturer, 1, ord2.event ());
          ic.ordered += q;
        }
    }
  // store item_count back into stock map to reflect any changes
  m_stockMap[ord.getItem ()] = ic;
}

/*
 * Consumer methods
 */
Consumer::Consumer (SimulationEngine& engine, const string & processName):
  Process (engine, processName)
{
}

void
Consumer::addItem (const string & retailer, const string & item,
                   unsigned int quantity, unsigned int delay)
{
  shopping_item si;
  si.retailer = retailer;
  si.item = item;
  si.quantity = quantity;
  si.delay = delay;
  m_shoppingList.push_back (si);
}

void
Consumer::processEvent (const Event & e)
{
  if (e.getEventName () == "Delivery")
    {
      Delivery del (e);
      FIDES_DEBUG ("Consumer(" << getProcessName () << ") order for " << del.
                   getQuantity () << " " << del.
                   getItem () << " took " << getTime () << " days.");

      map < string, Order * >::iterator itr =
        m_pendingOrders.find (del.getOrderId ());
      if (itr == m_pendingOrders.end ())
        {
          FIDES_THROW (logic_error, "did not find order for delivery: " << e);
        }
      m_pendingOrders.erase (itr);
    }
  else
    {
      FIDES_THROW (logic_error,
                   "consumer received an unexpected event: " << e.
                   getEventName ());
    }
}

void
Consumer::init ()
{
  vector < shopping_item >::const_iterator i;

  FIDES_DEBUG("about to schedule shopping events for " << getProcessName());

  for (i = m_shoppingList.begin (); i != m_shoppingList.end (); ++i)
    {
      Order *ord = new Order ((*i).item, (*i).quantity, getProcessName ());
      scheduleEvent ((*i).retailer, (*i).delay, ord->event ());
      m_pendingOrders[ord->getOrderId ()] = ord;
    }
}
