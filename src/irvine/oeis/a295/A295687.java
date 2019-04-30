package irvine.oeis.a295;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A295687 <code>a(n) = a(n-1) + a(n-3) + a(n-4)</code>, where <code>a(0) = 1, a(1) = 2, a(2) = 2, a(3) = 1</code>.
 * @author Georg Fischer
 */
public class A295687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295687() {
    super(new long[] {1L, 1L, 0L, 1L}, new long[] {1L, 2L, 2L, 1L});
  } // constructor()
} // A295687
