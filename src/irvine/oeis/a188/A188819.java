package irvine.oeis.a188;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A188819 Number of n X 3 binary arrays without the pattern 0 1 diagonally or antidiagonally.
 * @author Georg Fischer
 */
public class A188819 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A188819() {
    super(1, new long[] {0, 8, 9, -2, 1},
      new long[] {1, -2, 0, 2, -1});
  }
}
