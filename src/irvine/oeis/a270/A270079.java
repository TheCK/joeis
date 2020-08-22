package irvine.oeis.a270;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A270079 Number of active (ON,black) cells in n-th stage of growth of two-dimensional cellular automaton defined by "Rule 62", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A270079 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A270079() {
    super(0, new long[] {1, 4, 6, 4, 4, 0, 6, -12, -1, 4, 4, 0, -4},
      new long[] {1, -1, -1, 1, -1, 1, 1, -1});
  }
}
