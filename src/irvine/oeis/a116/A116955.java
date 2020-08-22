package irvine.oeis.a116;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A116955 a(n+1) = a(n) + (if a(n) is odd then (next odd square) else (next even square)), a(0) = 1.
 * @author Georg Fischer
 */
public class A116955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116955() {
    super(new long[] {-1L, 4L, -6L, 4L}, new long[] {10L, 14L, 30L, 66L}, 1L);
  } // constructor()
} // A116955
