package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A267850 Binary representation of the n-th iteration of the "Rule 229" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A267850 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267850() {
    super(0, new long[] {1, -91, 10200, -10000},
      new long[] {1, -101, 100});
  }
}
