package irvine.oeis.a107;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A107385 a(n) = a(n-1)+4*a(n-2)-4*a(n-4).
 * @author Georg Fischer
 */
public class A107385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107385() {
    super(new long[] {-4L, 0L, 4L, 1L}, new long[] {0L, 1L, 1L, 2L});
  } // constructor()
} // A107385
