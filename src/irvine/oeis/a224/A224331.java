package irvine.oeis.a224;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A224331 Number of idempotent n X n 0..6 matrices of rank n-1.
 * @author Georg Fischer
 */
public class A224331 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A224331() {
    super(1, new long[] {0, 1, 10, -47},
      new long[] {1, -16, 78, -112, 49});
  }
}
