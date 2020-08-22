package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A267530 Number of OFF (white) cells in the n-th iteration of the "Rule 141" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A267530 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267530() {
    super(0, new long[] {0, 2, 1, -1, -1},
      new long[] {1, -1, -1, 1});
  }
}
