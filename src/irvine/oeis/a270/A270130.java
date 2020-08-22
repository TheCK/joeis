package irvine.oeis.a270;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A270130 Number of active (ON,black) cells at stage 2^n-1 of the two-dimensional cellular automaton defined by "Rule 89", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A270130 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A270130() {
    super(0, new long[] {1, -3, 30, -35, -30, 40},
      new long[] {1, -7, 14, -8});
  }
}
