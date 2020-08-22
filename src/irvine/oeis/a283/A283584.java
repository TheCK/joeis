package irvine.oeis.a283;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A283584 Decimal representation of the x-axis, from the origin to the right edge, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 646", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A283584 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A283584() {
    super(0, new long[] {1, 3, 1, -1, 1, -1, -15, 47, -16, -84, 256, -256},
      new long[] {1, 0, -4, 0, 0, 0, 0, 0, -1, 0, 4});
  }
}
