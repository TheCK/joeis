package irvine.oeis.a284;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A284482 Decimal representation of the x-axis, from the origin to the right edge, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 950", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A284482 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A284482() {
    super(0, new long[] {1, 1, -1, 5, -2, 4, 0, -8, 16},
      new long[] {1, -2, 0, 0, -1, 2});
  }
}
