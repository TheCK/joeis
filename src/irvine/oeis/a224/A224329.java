package irvine.oeis.a224;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A224329 Number of idempotent n X n 0..4 matrices of rank n-1.
 * @author Georg Fischer
 */
public class A224329 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A224329() {
    super(1, new long[] {0, 1, 6, -23},
      new long[] {1, -12, 46, -60, 25});
  }
}
