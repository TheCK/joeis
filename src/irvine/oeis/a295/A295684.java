package irvine.oeis.a295;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A295684 a(n) = a(n-1) + a(n-3) + a(n-4), where a(0) = 2, a(1) = 0, a(2) = 1, a(3) = 1. 
 * @author Georg Fischer
 */
public class A295684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295684() {
    super(new long[] {1L, 1L, 0L, 1L}, new long[] {2L, 0L, 1L, 1L});
  } // constructor()
} // A295684
