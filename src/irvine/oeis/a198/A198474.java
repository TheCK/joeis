package irvine.oeis.a198;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A198474 Number of 2n X 2 0..2 arrays with values 0..2 introduced in row major order and each element equal to an odd number of horizontal and vertical neighbors.
 * @author Georg Fischer
 */
public class A198474 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A198474() {
    super(1, new long[] {0, 2, -6},
      new long[] {1, -9, 16});
  }
}
