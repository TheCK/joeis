package irvine.oeis.a203;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A203286 Number of arrays of 2n nondecreasing integers in -3..3 with sum zero and equal numbers greater than zero and less than zero.
 * @author Georg Fischer
 */
public class A203286 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A203286() {
    super(1, new long[] {0, 4, -4, 0, 5, -4, 1},
      new long[] {1, -4, 5, 0, -5, 4, -1});
  }
}
