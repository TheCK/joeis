package irvine.oeis.a284;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A284483 Binary representation of the x-axis, from the left edge to the origin, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 961", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A284483 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A284483() {
    super(0, new long[] {1, -10, 110, 1, -11, 10},
      new long[] {1, -10, -1, 10});
  }
}
