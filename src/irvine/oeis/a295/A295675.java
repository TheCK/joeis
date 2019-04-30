package irvine.oeis.a295;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A295675 <code>a(n) = a(n-1) + a(n-3) + a(n-4)</code>, where <code>a(0) = 1, a(1) = 1, a(2) = 2, a(3) = -2</code>.
 * @author Georg Fischer
 */
public class A295675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295675() {
    super(new long[] {1L, 1L, 0L, 1L}, new long[] {1L, 1L, 2L, -2L});
  } // constructor()
} // A295675
