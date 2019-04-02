package irvine.oeis.a295;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A295688 a(n) = a(n-1) + a(n-3) + a(n-4), where a(0) = 2, a(1) = 1, a(2) = 0, a(3) = 2. 
 * @author Georg Fischer
 */
public class A295688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295688() {
    super(new long[] {1L, 1L, 0L, 1L}, new long[] {2L, 1L, 0L, 2L});
  } // constructor()
} // A295688
