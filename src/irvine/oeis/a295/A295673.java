package irvine.oeis.a295;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A295673 a(n) = a(n-1) + a(n-3) + a(n-4), where a(0) = 4, a(1) = 3, a(2) = 2, a(3) = 1. 
 * @author Georg Fischer
 */
public class A295673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295673() {
    super(new long[] {1L, 1L, 0L, 1L}, new long[] {4L, 3L, 2L, 1L});
  } // constructor()
} // A295673
