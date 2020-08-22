package irvine.oeis.a220;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A220749 Equals one maps: number of n X 4 binary arrays indicating the locations of corresponding elements equal to exactly one of their horizontal and vertical neighbors in a random 0..3 n X 4 array.
 * @author Georg Fischer
 */
public class A220749 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A220749() {
    super(1, new long[] {0, 8, 32, 874, 2760, -1640, -240, -2374, 1120},
      new long[] {1, -18, 33, -16});
  }
}
