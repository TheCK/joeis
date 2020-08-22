package irvine.oeis.a266;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A266249 Number of ON (black) cells in the n-th iteration of the "Rule 9" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A266249 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266249() {
    super(0, new long[] {1, 0, 0, 2, 1, 1, -2, 1},
      new long[] {1, 0, -2, 0, 1});
  }
}
