package irvine.oeis.a270;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A270164 Number of active (ON,black) cells in n-th stage of growth of two-dimensional cellular automaton defined by "Rule 107", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A270164 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A270164() {
    super(0, new long[] {1, 5, 2, 26, 0, 1, -6, -12, 23, 16, -24, -12, 8, 4},
      new long[] {1, 0, -3, 0, 3, 0, -1});
  }
}
