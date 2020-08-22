package irvine.oeis.a273;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A273448 First differences of number of active (ON,black) cells in n-th stage of growth of two-dimensional cellular automaton defined by "Rule 721", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A273448 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A273448() {
    super(0, new long[] {3, 11, -11, 16, -18, 7},
      new long[] {1, -2, 1});
  }
}
