package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A269511 Partial sums of the number of active (ON,black) cells in n-th stage of growth of two-dimensional cellular automaton defined by "Rule 342", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A269511 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A269511() {
    super(0, new long[] {1, 5, 6, 14, 1, 5},
      new long[] {1, -1, -2, 2, 0, 0, 2, -2, -1, 1});
  }
}
