package irvine.oeis.a321;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A321119 a(n) = ((1 - sqrt(3))^n + (1 + sqrt(3))^n)/2^floor((n - 1)/2); n-th row common denominator of A321118.
 * @author Georg Fischer
 */
public class A321119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A321119() {
    super(new long[] {-1L, 0L, 4L, 0L}, new long[] {4L, 2L, 8L, 10L});
  } // constructor()
} // A321119
