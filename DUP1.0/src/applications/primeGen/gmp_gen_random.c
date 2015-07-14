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

/**
 * @file filters/gmp_gen_random.c
 * @brief filter that uses gmp to generate random numbers
 * between 0 and 2^LENGTH specified on command line. One
 * number per line is printed forever or up to NUM numbers
 * @author Nathan Evans
 */

#include <stdio.h>
#include <gmp.h>
#include <stdarg.h>
#include <stdlib.h>
#include <openssl/rand.h>

#define DEBUG 1

int
main (int argc, char **argv)
{
  unsigned int base = 2;
  unsigned int exp;
  unsigned int nums;
  unsigned int count;
  unsigned long int seed;
#ifdef DEBUG
  double percentage;
  double last_percentage;
  last_percentage = 0.0;
#endif
  RAND_bytes ((unsigned char *) &seed, sizeof (seed));

  mpz_t max_size;
  mpz_t num;
  gmp_randstate_t state;
  nums = 0;
  exp = 2048;
  switch (argc)
    {
    case 3:
      if (1 != sscanf (argv[2], "%u", &nums))
        {
          fprintf (stderr,
                   "Invalid argument `%s', specify a positive numerical value for number of numbers please (or 0 to run forever!)\n",
                   argv[2]);
          return -1;
        }
      /* Fall through */
    case 2:
      if ((1 != sscanf (argv[1], "%u", &exp)) || (exp == 0))
        {
          fprintf (stderr,
                   "Invalid argument `%s', specify a positive numerical value for max random length\n",
                   argv[1]);
          return -1;
        }
    }

  gmp_randinit_default (state);
  mpz_init (max_size);
  mpz_init (num);
  gmp_randseed_ui (state, seed);

  mpz_ui_pow_ui (max_size, base, exp);

#ifdef DEBUG
  gmp_fprintf (stderr,
               "Generating %d gmp random numbers of max length\n%Zd\n", nums,
               max_size);
#endif

  count = 0;
  while ((count < nums) || (nums == 0))
    {
      mpz_urandomm (num, state, max_size);
#ifdef DEBUG
      percentage = ((double) count / nums) * 100;
      if ((percentage - last_percentage) > 1)
        {
          /*gmp_fprintf(stderr, "%d percent done\n",(int)percentage); */
          last_percentage = percentage;
        }
#endif
      gmp_fprintf (stdout, "%Zd\n", num);
      count++;
    }

  return 0;
}
