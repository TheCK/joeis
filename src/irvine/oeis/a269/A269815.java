package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A269815 Number of active (ON,black) cells at stage 2^n-1 of the two-dimensional cellular automaton defined by "Rule 35", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A269815 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A269815() {
    super(0, new long[] {1, -2, 16, -12},
      new long[] {1, -7, 14, -8});
  }
}
