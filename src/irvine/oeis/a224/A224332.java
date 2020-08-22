package irvine.oeis.a224;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A224332 Number of idempotent n X n 0..7 matrices of rank n-1.
 * @author Georg Fischer
 */
public class A224332 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A224332() {
    super(1, new long[] {0, 1, 12, -62},
      new long[] {1, -18, 97, -144, 64});
  }
}
