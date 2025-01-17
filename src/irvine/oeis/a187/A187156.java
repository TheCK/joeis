package irvine.oeis.a187;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A187156 Number of 3-step one space at a time bishop's tours on an n X n board summed over all starting positions.
 * @author Georg Fischer
 */
public class A187156 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A187156() {
    super(1, new long[] {0, 0, 0, 20, 4},
      new long[] {1, -3, 3, -1});
  }
}
