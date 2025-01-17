package irvine.oeis.a205;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A205345 Number of length 8 nonnegative integer arrays starting and ending with 0 with adjacent elements unequal but differing by no more than n.
 * @author Georg Fischer
 */
public class A205345 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A205345() {
    super(1, new long[] {0, 0, 272, 1368, 1460, 258, 6},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
