package irvine.oeis.a277;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A277927 Binary representation of the x-axis, from the origin to the right edge, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 5", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A277927 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A277927() {
    super(0, new long[] {1, 1, -101, 1010, 100, -1000},
      new long[] {1, 0, -101, 0, 100});
  }
}
