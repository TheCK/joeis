package irvine.oeis.a282;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A282415 Binary representation of the x-axis, from the left edge to the origin, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 469", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A282415 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A282415() {
    super(0, new long[] {1, 10, -100, -10},
      new long[] {1, 0, -111, 0, 1110, 0, -1000});
  }
}
