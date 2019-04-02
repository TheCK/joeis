package irvine.oeis.a319;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A319451 Numbers that are congruent to {0, 3, 6} mod 12; a(n) = 3*floor(4*n/3). 
 * @author Georg Fischer
 */
public class A319451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A319451() {
    super(new long[] {-1L, 1L, 0L, 1L}, new long[] {0L, 3L, 6L, 12L});
  } // constructor()
} // A319451
