package irvine.oeis.a278;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A278901 Decimal representation of the x-axis, from the origin to the right edge, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 107", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A278901 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A278901() {
    super(0, new long[] {1, 2, -1, 5, -16, -16, 0, -16, 144, 16, -64, 64, -320, -320, 
      256, 256},
      new long[] {1, 0, -5, 0, 0, 0, 20, 0, -16});
  }
}
