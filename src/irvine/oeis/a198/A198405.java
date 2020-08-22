package irvine.oeis.a198;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A198405 Number of 2n X 2 0..4 arrays with values 0..4 introduced in row major order and each element equal to exactly one horizontal and vertical neighbor.
 * @author Georg Fischer
 */
public class A198405 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A198405() {
    super(1, new long[] {0, 2, -85, 892, -3209, 3552},
      new long[] {1, -51, 691, -3601, 7056, -4096});
  }
}
