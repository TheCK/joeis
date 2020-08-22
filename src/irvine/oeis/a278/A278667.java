package irvine.oeis.a278;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A278667 Decimal representation of the x-axis, from the origin to the right edge, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 62", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A278667 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A278667() {
    super(0, new long[] {1, 1, -3, -3, -4, 12, 16, -64, 0, 0, 64},
      new long[] {1, -2, 0, 0, -1, 2});
  }
}
