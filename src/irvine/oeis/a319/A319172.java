package irvine.oeis.a319;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A319172 a(n) = 2*(a(n-1) + a(n-3)) - a(n-4), with a(0) = 1, a(1) = 2, a(2) = 5 and a(3) = 12. 
 * @author Georg Fischer
 */
public class A319172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A319172() {
    super(new long[] {-1L, 2L, 0L, 2L}, new long[] {1L, 2L, 5L, 12L});
  } // constructor()
} // A319172
