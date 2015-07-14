#!/usr/bin/python
import getopt
import os
import random
import sys

# Python Recipe 1.7
class Bunch:
    def __init__(self, **kwds): self.__dict__ = kwds

# some constants
MIN_MANUFACTURER_ITEMS = 1
MAX_MANUFACTURER_ITEMS = 5
MIN_MANUFACTURER_DELAY = 1
MAX_MANUFACTURER_DELAY = 10
MIN_RETAILER_ITEMS = 1
MAX_RETAILER_ITEMS = 20
MIN_RETAILER_UNIT_SIZE = 1
MAX_RETAILER_UNIT_SIZE = 100
MIN_CONSUMER_ORDERS = 1
MAX_CONSUMER_ORDERS = 25
MIN_CONSUMER_QUANTITY = 1
MAX_CONSUMER_QUANTITY = 50
MIN_CONSUMER_DELAY = 1
MAX_CONSUMER_DELAY = 365

# write a debug statement to stderr
def debug(s):
    sys.stderr.write("DEBUG: ")
    sys.stderr.write(s)
    sys.stderr.write("\n")

# write some xml to file x
prefix = 0
def write(f, s):
    global prefix

    assert s.startswith("<"), "unexpected line content: '%s'" % s

    if s.startswith("</"):
        prefix -= 1

    for i in range(prefix):
        f.write("")
    f.write(s)
    f.write("\n")

    if not s.startswith("</") and not s.endswith("/>"):
        prefix += 1


def write_manufacturer(f, data, name):
    # pick the items
    write(f, "<manufacturer name='%s'>" % name)

    n_items = random.randint(MIN_MANUFACTURER_ITEMS, min(MAX_MANUFACTURER_ITEMS, len(data.allItems)))
    items = random.sample(data.allItems, n_items)

    for item in items:
        if item in data.manufacturedItems.keys():
            data.manufacturedItems[item].append(name)
        else:
            data.manufacturedItems[item] = [ name ]

        write(f, "<item name='%s' delay='%d'/>" % (item, random.randint(MIN_MANUFACTURER_DELAY, MAX_MANUFACTURER_DELAY)))
        
    write(f, "</manufacturer>")

def write_retailer(f, data, name):
    # pick the items
    write(f, "<retailer name='%s'>" % name)

    n_items = random.randint(MIN_RETAILER_ITEMS, min(MAX_RETAILER_ITEMS, len(data.manufacturedItems.keys())))
    items = random.sample(data.manufacturedItems.keys(), n_items)

    for item in items:
        if item in data.retailedItems.keys():
            data.retailedItems[item].append(name)
        else:
            data.retailedItems[item] = [ name ]

        # pick the manufacturer
        manufacturer = random.choice(data.manufacturedItems[item])

        write(f, "<item name='%s' manufacturer='%s' unitSize='%d'/>" % (item, manufacturer, random.randint(MIN_RETAILER_UNIT_SIZE, MAX_RETAILER_UNIT_SIZE)))
        
    write(f, "</retailer>")
    

def write_consumer(f, data, name):
    write(f, "<consumer name='%s'>" % name)
    
    n_orders = random.randint(MIN_CONSUMER_ORDERS, MAX_CONSUMER_ORDERS)

    for i in range(n_orders):
        item = random.choice(data.retailedItems.keys())
        retailer = random.choice(data.retailedItems[item])
        quantity = random.randint(MIN_CONSUMER_QUANTITY, MAX_CONSUMER_QUANTITY)
        delay = random.randint(MIN_CONSUMER_DELAY, MAX_CONSUMER_DELAY)

        write(f, "<order item='%s' retailer='%s' quantity='%d' delay='%d'/>" % (item, retailer, quantity, delay))
    
    write(f, "</consumer>");


# function to open an appropriately named output file (and check for
# existence) or to return sys.stdout
def open_output_file(basename, i, force):
    if basename is not None:
        path = "%s.%02d.xml" % (basename, (i+1))
        
        if os.path.exists(path) and not force:
            raise Exception("%s already exists. Use the -f flag to force overwriting" % path)
            
        return open(path, "w")
    else:
        return sys.stdout
    

# function that actually does something.  'basename' can be None in
# which case all the XML will be written to stdout
def main(basename, n_consumers, n_retailers, n_manufacturers, n_trials, n_items, force):
    allItems = [ "item%d" % (i+1) for i in range(n_items) ]

    for i in range(n_trials):
        data = Bunch()

        data.allItems = allItems
        data.manufacturedItems = {}
        data.retailedItems = {}

        f = open_output_file(basename, i, force)

        write(f, "<commsim>")

        # do the manufacturers first so we can determine who makes
        # each item
        for i in range(n_manufacturers):
            name = "m%d" % (i+1)
            write_manufacturer(f, data, name)

        for i in range(n_retailers):
            name = "r%d" % (i+1)
            write_retailer(f, data, name)

        for i in range(n_consumers):
            name = "c%d" % (i+1)
            write_consumer(f, data, name)

        write(f, "</commsim>")


if __name__ == '__main__':
    USAGE = "usage: generate_commsim_xml.py [<basename>]"

    try:
        opts, args = getopt.getopt(sys.argv[1:], "c:r:m:t:i:f", ["consumer-count=", "retailer-count=", "manufacturer-count=", "trial-count=", "item-count=", "force"])
    except getopt.GetoptError, err:
        print "%s: %s" % (USAGE, err)
        sys.exit(2)

    basename = None

    if len(args) > 1:
        print USAGE
        sys.exit(1)

    if len(args) == 1:
        basename = args[0]

    n_consumers = 1
    n_retailers = 1
    n_manufacturers = 1
    n_trials = 1
    n_items = 1
    force = False

    for o, a in opts:
        if o in ("-c", "--consumer-count"):
            n_consumers = a
        elif o in ("-r", "--retailer-count"):
            n_retailers = a
        elif o in ("-m", "--manufacturer-count"):
            n_manufacturers = a
        elif o in ("-t", "--trial-count"):
            n_trials = a
        elif o in ("-i", "--item-count"):
            n_items = a
        elif o in ("-f", "--force"):
            force = True
        else:
            assert False, "unhandled option"

    debug("basename = %s" % basename)
    debug("n_consumers = %s" % n_consumers)
    debug("n_retailers = %s" % n_retailers)
    debug("n_manufacturers = %s" % n_manufacturers)
    debug("n_trials = %s" % n_trials)
    debug("n_items = %s" % n_items)
    debug("force = %s" % force)

    main(basename, int(n_consumers), int(n_retailers), int(n_manufacturers), int(n_trials), int(n_items), force)
