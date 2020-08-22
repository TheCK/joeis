package irvine.oeis.a208;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A208402 Number of n X 2 0..3 arrays with new values 0..3 introduced in row major order and no element equal to more than two of its immediate leftward or upward or right-upward antidiagonal neighbors.
 * @author Georg Fischer
 */
public class A208402 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A208402() {
    super(1, new long[] {0, 2, -27, 40},
      new long[] {1, -21, 84, -64});
  }
}
