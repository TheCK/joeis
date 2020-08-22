package irvine.oeis.a290;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A290235 Decimal representation of the diagonal from the origin to the corner of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 773", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A290235 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A290235() {
    super(0, new long[] {1, 0, 0, -4},
      new long[] {1, -1, -6, 6, 8, -8});
  }
}
