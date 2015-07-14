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
#include <iostream>
#include <map>
#include <sstream>
#include <fstream>
#include <stdexcept>
#include "commsim.h"
#include "string.h"

using namespace std;
using namespace commsim;
using namespace fides;

int
main (int argc, char **argv)
{
	bool read_from_file = false;
	char * filename;
	filename = NULL;
  /*
   * check command line arguments.
   */
  if (argc < 2)
    {
      FIDES_ERROR
        ("usage: consumer <processName>|<retailer1:item1:quantity1:delay1>[,<retailer2:item2:quantity2:delay2>...]...");
      return 1;
    }

	if (strcmp(argv[1], "-f") == 0)
	{
		read_from_file = true;
		if (argc == 3)
			filename = argv[2];
		else
		{
			FIDES_ERROR ("usage: consumer -f filename");
			return 1;
		}
	}

  try
  {
  	vector < string > all_tokens;
	ParallelEngine engine;
    if (read_from_file)
    {
    	ifstream infile;
    	infile.open(filename);
    	if (!infile)
    	{
    		FIDES_ERROR ("Couldn't open file " << filename << ", aborting!\n");
    		return 1;
    	}
    	string input;
    	while(infile >> input)
    		all_tokens.push_back(string(input.c_str()));

    	infile.close();
    }
    else
    {
			for (int i = 1; i < argc; i++)
				{
					string arg (argv[i]);
					FIDES_DEBUG ("looking at argument (" << i << "):" << arg);
					all_tokens.push_back(arg);
				}
    }

  	for (vector < string >::const_iterator itr = all_tokens.begin ();
  								 itr != all_tokens.end (); itr++)
  	{
  		FIDES_DEBUG ("Got " << (*itr) << endl);
  	}

  	for (vector < string >::const_iterator itr = all_tokens.begin ();
  								 itr != all_tokens.end (); itr++)
  	{
			vector < string > tokens1;
			split ((*itr), tokens1, "|");
			if (tokens1.size () != 2)
					FIDES_THROW (invalid_argument,
											 "argument (" << (*itr) << ") not in expected format");

			FIDES_DEBUG ("parsed process ID: " << tokens1[0]);
			FIDES_DEBUG ("parsed the rest as: " << tokens1[1]);

			Consumer *c = new Consumer (engine, tokens1[0]);

			vector < string > tokens2;
			split (tokens1[1], tokens2, ",");

			for (vector < string >::const_iterator itr = tokens2.begin ();
					 itr != tokens2.end (); itr++)
				{
					FIDES_DEBUG ("looking at argument: " << (*itr));

					string::size_type idx1 = (*itr).find (":");
					string::size_type idx2 = (*itr).find(":", idx1 + 1);
					string::size_type idx3 = (*itr).find(":", idx2 + 1);
					if ((idx1 == string::npos) || (idx2 == string::npos) || (idx3 == string::npos))
						{
						  delete c;
							FIDES_THROW (invalid_argument,
													 "argument (" << (*itr) <<
													 ") not in expected <retailer1:item1:quantity1:delay1> format");
						}
					string retailer ((*itr), 0, idx1);
					string item ((*itr), idx1 + 1, idx2 - (idx1 + 1));
					string quantity ((*itr), idx2 + 1, idx3 - (idx2 + 1));
					string delay((*itr), idx3 + 1);

					trim (retailer);
					trim (item);
					trim (quantity);
					trim (delay);

					if ((retailer.length()  == 0) || (item.length()  == 0) || (quantity.length() == 0) || (delay.length() == 0))
					{
					  delete c;
						FIDES_THROW (invalid_argument,
												 "argument (" << (*itr) <<
												 ") not in expected <retailer1:item1:quantity1:delay1> format");
					}

					FIDES_DEBUG ("parsed retailer (" << retailer << ") and item (" << item << ") and quantity(" << quantity <<
											") and delay(" << delay << ") out of (" << (*itr) << ")");

					c->addItem(retailer, item, strtoul (quantity.c_str (), NULL, 10), strtoul (delay.c_str (), NULL, 10));
				}
  	}

	FIDES_DEBUG ("about to call process_input");
	engine.run();
    return 0;
  }
  catch (exception & e)
  {
    FIDES_ERROR (e.what ());
  }
  catch (...)
  {
    FIDES_ERROR ("unknown exception caught");
  }
  return 1;
}
