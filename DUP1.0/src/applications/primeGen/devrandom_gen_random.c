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
 * @file filters/devrandom_gen_random.c
 * @brief filter that reads from /dev/random to generate random
 * numbers of length LENGTH bytes specified on command line. One
 * number per line is printed forever or up to NUM numbers
 * @author Nathan Evans
 */

#include "../filters/dup_filter_lib.h"
#include <stdio.h>
#include <gmp.h>
#include <stdarg.h>
#include <stdlib.h>
#include <openssl/rand.h>

#define DEBUG

int
main (int argc, char **argv)
{
  FILE *devrandom;
  unsigned int num_length;
  unsigned int nums;
  unsigned int count;
  char *buf;
  mpz_t num;
#ifdef DEBUG
  mpz_t biggest_num;
#endif
  nums = 0;
  size_t ret;

  switch (argc)
    {
    case 3:
      if (1 != sscanf (argv[2], "%u", &nums))
        {
          fprintf (stderr,
                   "Invalid argument `%s', specify a positive value for number of numbers please (or zero to run forever!)\n",
                   argv[2]);
          return -1;
        }
      /* Fall through, wheeeeeeeeeeeeeeee */
    case 2:
      if ((1 != sscanf (argv[1], "%u", &num_length)) || ((num_length) == 0))
        {
          fprintf (stderr,
                   "Invalid argument `%s', specify a positive value for number of bytes\n",
                   argv[1]);
          return -1;
        }
      break;
    case 1:
      num_length = 1024;
      break;
    default:
      fprintf (stderr, "Invalid number of arguments.\n");
      return -1;

    }
  buf = malloc (num_length);
  mpz_init (num);

  count = 0;
  devrandom = fopen ("/dev/random", "r");

#ifdef DEBUG
  /* 2^sizeof(buf[0])*num_length */
  mpz_init (biggest_num);
  mpz_ui_pow_ui (biggest_num, 2, 8 * num_length);
  gmp_fprintf (stderr,
               "Generating devrandom random numbers of max value %Zd\n",
               biggest_num);
#endif

  while ((count < nums) || (nums == 0))
    {
      ret = fread (buf, sizeof (buf[0]), num_length, devrandom);
      mpz_import (num, num_length, 1, sizeof (buf[0]), 0, 0, (void *) buf);
      gmp_fprintf (stdout, "%Zd\n", num);
      count++;
    }
  fclose (devrandom);

  return 0;
}
