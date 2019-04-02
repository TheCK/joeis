package irvine.oeis.a295;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A295735 a(n) = a(n-1) + 3*a(n-2) -2*a(n-3) - 2*a(n-4), where a(0) = 0, a(1) = -1, a(2) = 0, a(3) = 1. 
 * @author Georg Fischer
 */
public class A295735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295735() {
    super(new long[] {-2L, -2L, 3L, 1L}, new long[] {0L, -1L, 0L, 1L});
  } // constructor()
} // A295735
