package irvine.oeis.a283;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A283356 Binary representation of the x-axis, from the origin to the right edge, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 621", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A283356 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A283356() {
    super(0, new long[] {1, -9, -10, 1100, -1000, -90000, 0, 100000},
      new long[] {1, -10, -1, 10});
  }
}
