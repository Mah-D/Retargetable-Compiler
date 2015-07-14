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
#include<assert.h>
#include "commsim.h"

using namespace commsim;
using namespace fides;
using namespace std;

int
main (int argc, char **argv)
{
  {
    // regular constructor
    Order order1 ("item1", 10, "deliverTo1");

    assert (order1.getItem () == "item1");
    assert (order1.getQuantity () == 10);
    assert (order1.getDeliverTo () == "deliverTo1");

    // copy constructor
    Order order2 (order1);
    assert (order2.getItem () == "item1");
    assert (order2.getOrderId () == order1.getOrderId ());
    assert (order2.getQuantity () == 10);
    assert (order2.getDeliverTo () == "deliverTo1");

    // check the FIDESEvent type
    try
    {
      Event junkEvent ("Junk");
      Order o (junkEvent);
      assert (0);
    }
    catch (logic_error & e)
    {
      // eat it
    }

    Event event ("Order");
    event.addValue ("item", "theItem2");
    event.addValue ("orderId", "ABC123");
    event.addValue ("quantity", "100");
    event.addValue ("deliverTo", "theDestination2");

    Order order3 (event);
    assert (order3.getItem () == "theItem2");
    assert (order3.getOrderId () == "ABC123");
    assert (order3.getQuantity () == 100);
    assert (order3.getDeliverTo () == "theDestination2");

    // check the round-trip
    Event e2 (order3.event ());

    assert (event == e2);
  }

  // test Delivery
  {
    // regular constructor
    Delivery delivery1 ("item1", "deliveryId1", 10);

    assert (delivery1.getItem () == "item1");
    assert (delivery1.getOrderId () == "deliveryId1");
    assert (delivery1.getQuantity () == 10);

    // copy constructor
    Delivery delivery2 (delivery1);
    assert (delivery2.getItem () == "item1");
    assert (delivery2.getOrderId () == "deliveryId1");
    assert (delivery2.getQuantity () == 10);

    // check the Event type
    try
    {
      Event junkEvent ("Junk");
      Delivery d (junkEvent);
      assert (0);
    }
    catch (logic_error & e)
    {
      // eat it
    }

    Event event ("Delivery");
    event.addValue ("item", "theItem2");
    event.addValue ("orderId", "ABC123");
    event.addValue ("quantity", "100");

    Delivery delivery3 (event);
    assert (delivery3.getItem () == "theItem2");
    assert (delivery3.getOrderId () == "ABC123");
    assert (delivery3.getQuantity () == 100);

    // check the round-trip
    Event e2 (delivery3.event ());

    assert (event == e2);
  }
}
