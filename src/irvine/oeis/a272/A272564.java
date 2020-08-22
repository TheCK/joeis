package irvine.oeis.a272;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A272564 Number of active (ON,black) cells in n-th stage of growth of two-dimensional cellular automaton defined by "Rule 501", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A272564 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A272564() {
    super(0, new long[] {1, 8, 2, 20, 1, 4, 0, -4, -4, 8, 0, -4},
      new long[] {1, 0, -3, 0, 3, 0, -1});
  }
}
