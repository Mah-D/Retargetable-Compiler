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
#ifndef COMMSIM_H
#define COMMSIM_H

#include <sstream>
#include "fides.h"

namespace commsim
{
  //
  // domain-specific events for the commerce (consumer, manufacturer,
  // retailer) simulation system
  //
  class Order
  {
  public:
    Order (const std::string & item, unsigned int quantity,
           const std::string & deliverTo);
      Order (const fides::Event & event);
      Order (const Order & that);

    const std::string & getItem () const;
    const std::string & getOrderId () const;
    unsigned int getQuantity () const;
    const std::string & getDeliverTo () const;

      std::string str () const;
      fides::Event event () const;

  private:
      std::string m_item;
      std::string m_orderId;
    unsigned int m_quantity;
      std::string m_deliverTo;
  };

  class Delivery
  {
  public:
    Delivery (const std::string & item, const std::string & orderId,
              unsigned int quantity);
      Delivery (const Delivery & that);
      Delivery (const fides::Event & event);

    const std::string & getItem () const;
    const std::string & getOrderId () const;
    unsigned int getQuantity () const;

      std::string str () const;
      fides::Event event () const;

  private:
      std::string m_item;
      std::string m_orderId;
    unsigned int m_quantity;
  };

  class Manufacturer:public fides::Process
  {
  public:
    Manufacturer (fides::SimulationEngine& engine, const std::string & processName);

    void addItem (const std::string & item, unsigned int delay);

    virtual void processEvent (const fides::Event & event);

  private:
      std::map < std::string, unsigned int >m_delayMap;
  };

  class Retailer:public fides::Process
  {
  public:
    Retailer (fides::SimulationEngine& engine, const std::string & retailerName);

    void addItem (const std::string & item, const std::string & manufacturer,
                  unsigned int unit);

    virtual void processEvent (const fides::Event & e);

  private:
    void handleDelivery (const Delivery & del);

    void handleOrder (const Order & ord);

    struct item_count
    {
      std::string manufacturer;
      unsigned int unit;
      unsigned int stock;
      unsigned int held;
      unsigned int ordered;
      unsigned int claimed;
    };

      std::map < std::string, item_count > m_stockMap;
      std::map < std::string, std::queue < Order > >m_pendingOrders;
  };

  class Consumer:public fides::Process
  {
  public:
    Consumer (fides::SimulationEngine& engine, const std::string & processName);

    void addItem (const std::string & retailer, const std::string & item,
                  unsigned int quantity, unsigned int delay);

    virtual void init ();
    virtual void processEvent (const fides::Event & e);
  private:
    struct shopping_item
    {
      std::string retailer;
      std::string item;
      unsigned int quantity;
      unsigned int delay;
    };
      std::vector < shopping_item > m_shoppingList;
      std::map < std::string, Order * >m_pendingOrders;
  };
};

#endif
