package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A267351 Decimal representation of the n-th iteration of the "Rule 123" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A267351 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267351() {
    super(0, new long[] {1, 5, -7, 14, -154, -64, 160},
      new long[] {1, 0, -21, 0, 84, 0, -64});
  }
}
