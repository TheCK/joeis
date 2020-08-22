package irvine.oeis.a208;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A208641 Number of 6 X n 0..1 arrays with new values 0..1 introduced in row major order and no element equal to more than one of its immediate leftward or upward or right-upward antidiagonal neighbors.
 * @author Georg Fischer
 */
public class A208641 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A208641() {
    super(1, new long[] {0, 32, 9, -140, 74, 85, -37, -34, 4, 8},
      new long[] {1, -7, 20, -30, 25, -11, 2});
  }
}
