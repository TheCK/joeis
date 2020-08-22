package irvine.oeis.a280;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A280370 Decimal representation of the x-axis, from the origin to the right edge, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 259", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A280370 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A280370() {
    super(0, new long[] {1, 2, 1, -9, -2, 10},
      new long[] {1, 0, -5, 0, 4});
  }
}
