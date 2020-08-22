package irvine.oeis.a271;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A271060 Number of active (ON,black) cells in n-th stage of growth of two-dimensional cellular automaton defined by "Rule 261", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A271060 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A271060() {
    super(0, new long[] {-1, -8, 2, -24, -1},
      new long[] {-1, 0, 3, 0, -3, 0, 1});
  }
}
