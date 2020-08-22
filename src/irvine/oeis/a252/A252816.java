package irvine.oeis.a252;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A252816 Number of n X 4 nonnegative integer arrays with upper left 0 and every value within 2 of its city block distance from the upper left and every value increasing by 0 or 1 with every step right or down.
 * @author Georg Fischer
 */
public class A252816 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A252816() {
    super(1, new long[] {0, 7, -23, 79, -147, 176, -138, 67, -18, 2},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
