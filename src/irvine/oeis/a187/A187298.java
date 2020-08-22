package irvine.oeis.a187;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A187298 Number of 3-step one space leftwards or up, two space rightwards or down asymmetric rook's tours on an n X n board summed over all starting positions.
 * @author Georg Fischer
 */
public class A187298 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A187298() {
    super(1, new long[] {0, 0, 2, 30, -4, 10, -6},
      new long[] {1, -3, 3, -1});
  }
}
