package irvine.oeis.a295;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A295672 a(n) = a(n-1) + a(n-3) + a(n-4), where a(0) = 1, a(1) = 1, a(2) = 1, a(3) = -2. 
 * @author Georg Fischer
 */
public class A295672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295672() {
    super(new long[] {1L, 1L, 0L, 1L}, new long[] {1L, 1L, 1L, -2L});
  } // constructor()
} // A295672
