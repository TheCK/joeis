package irvine.oeis.a290;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A290683 Decimal representation of the diagonal from the origin to the corner of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 929", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A290683 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A290683() {
    super(0, new long[] {1, -2, 6, -12, 24, -16},
      new long[] {1, -3, 2});
  }
}
