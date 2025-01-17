package irvine.oeis.a209;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A209094 Number of n X 2 0..2 arrays with new values 0..2 introduced in row major order and no element equal to more than one of its immediate leftward or upward or right-upward antidiagonal neighbors.
 * @author Georg Fischer
 */
public class A209094 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A209094() {
    super(1, new long[] {0, 2, -5, 2},
      new long[] {1, -8, 4});
  }
}
