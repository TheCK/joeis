package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A267779 Binary representation of the n-th iteration of the "Rule 211" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A267779 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267779() {
    super(0, new long[] {1, 1, 900, 11000},
      new long[] {1, -100, -1, 100});
  }
}
