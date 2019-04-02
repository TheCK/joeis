package irvine.oeis.a319;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A319128 Interleave n*(3*n - 2), 3*n^2 + n - 1, n=0,0,1,1, ... . 
 * @author Georg Fischer
 */
public class A319128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A319128() {
    super(new long[] {1L, -2L, 0L, 2L}, new long[] {0L, -1L, 1L, 3L});
  } // constructor()
} // A319128
