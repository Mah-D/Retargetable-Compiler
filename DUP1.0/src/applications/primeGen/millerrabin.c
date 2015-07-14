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

#include "../filters/dup_filter_lib.h"
#include <openssl/rand.h>
#include "gmp.h"

#define DEBUG

static size_t num_tests;
#ifdef DEBUG
static unsigned int tests;
static unsigned int primes;
static double percentage;
#endif

static int
millerrabin (mpz_srcptr n, mpz_srcptr nm1, mpz_ptr x, mpz_ptr y,
             mpz_srcptr q, unsigned long int k)
{
  unsigned long int i;

  mpz_powm (y, x, q, n);

  if (mpz_cmp_ui (y, 1L) == 0 || mpz_cmp (y, nm1) == 0)
    return 1;

  for (i = 1; i < k; i++)
    {
      mpz_powm_ui (y, y, 2L, n);
      if (mpz_cmp (y, nm1) == 0)
        return 1;
      if (mpz_cmp_ui (y, 1L) == 0)
        return 0;
    }
  return 0;
}

int
mpz_millerrabin_randseed (mpz_srcptr n, int reps)
{
  int r;
  mpz_t nm1, nm3, x, y, q;
  unsigned long int k;
  gmp_randstate_t rstate;
  int is_prime;
  unsigned long int seed;

  RAND_bytes ((unsigned char *) &seed, sizeof (seed));

  mpz_init2 (nm1, n->_mp_size + 1);
  mpz_sub_ui (nm1, n, 1L);

  mpz_init2 (x, n->_mp_size + 1);
  mpz_init2 (y, 2 * n->_mp_size);       /* mpz_powm_ui needs excessive memory!!! */

  /* Perform a Fermat test.  */
  mpz_set_ui (x, 210L);
  mpz_powm (y, x, nm1, n);
  if (mpz_cmp_ui (y, 1L) != 0)
    {
      return 0;
    }

  mpz_init2 (q, n->_mp_size);

  /* Find q and k, where q is odd and n = 1 + 2**k * q.  */
  k = mpz_scan1 (nm1, 0L);
  mpz_tdiv_q_2exp (q, nm1, k);

  /* n-3 */
  mpz_init2 (nm3, n->_mp_size + 1);
  mpz_sub_ui (nm3, n, 3L);
  if (mpz_cmp_ui (nm3, 1L) < 0)
    {
      return 0;
    }

  gmp_randinit_default (rstate);
  gmp_randseed_ui (rstate, seed);

  is_prime = 1;
  for (r = 0; r < reps && is_prime; r++)
    {
      /* 2 to n-2 inclusive, don't want 1, 0 or -1 */
      mpz_urandomm (x, rstate, nm3);
      mpz_add_ui (x, x, 2L);
      is_prime = millerrabin (n, nm1, x, y, q, k);
    }

  gmp_randclear (rstate);

  return is_prime;
}

static int
process_input (void *unused, char *start, char *end)
{
  size_t size;
  int ret;
  size = 1 + end - start;
  start[size - 1] = '\0';

  mpz_t num;
  mpz_init (num);
  mpz_set_str (num, start, 10);
  if ((mpz_sgn (num) != 0) && (mpz_sgn (num) > 0))
    {
      ret = mpz_millerrabin_randseed (num, num_tests);

      if (ret == 1)
        {
          gmp_fprintf (stdout, "%Zd,%d\n", num, 0);
#ifdef DEBUG
          primes++;
#endif
        }
#ifdef DEBUG
      tests++;
#endif
    }

  return 1;
}

int
main (int argc, char *argv[])
{

  char *buffer;
  size_t buf_size;
  size_t off_start;
  size_t off_position;
  size_t end_position;

  DUP_LineProcessor proc;
  int ret;

  proc = &process_input;
  buf_size = DEFAULT_BUF_SIZE;
  switch (argc)
    {
    case 2:
      DUP_parse_record_size_arguments (argc, argv, &num_tests);
      break;
    case 1:
      num_tests = 25;
    }
  buffer = malloc (buf_size);
  off_position = 0;
  off_start = 0;
  end_position = 0;
  do
    {
      ret = DUP_try_read_line (0,
                               &buffer, &buf_size, &off_start, &end_position, proc, NULL);
    }
  while (ret >= 0);

#ifdef DEBUG
  percentage = (float) primes / tests;
  fprintf (stderr, "%u Primes found out of %u tested, Percentage %f\n",
           primes, tests, percentage);
#endif
  fprintf (stdout, "quit\n");
  return 0;
}
