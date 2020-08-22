package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A267677 Binary representation of the n-th iteration of the "Rule 197" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A267677 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267677() {
    super(0, new long[] {1, -100, 9999, 100, -9900, -10000},
      new long[] {1, -110, 999, 110, -1000});
  }
}
