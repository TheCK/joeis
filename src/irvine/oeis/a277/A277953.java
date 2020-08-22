package irvine.oeis.a277;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A277953 Binary representation of the x-axis, from the origin to the right edge, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 14", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A277953 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A277953() {
    super(0, new long[] {1, 1, -100},
      new long[] {1, -10, -1, 10});
  }
}
