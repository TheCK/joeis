package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A269878 Partial sums of the number of active (ON,black) cells in n-th stage of growth of two-dimensional cellular automaton defined by "Rule 43", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A269878 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A269878() {
    super(0, new long[] {1, 5, 2, 22, 1, 1},
      new long[] {1, -1, -3, 3, 3, -3, -1, 1});
  }
}
