package irvine.oeis.a285;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A285612 Binary representation of the diagonal from the corner to the origin of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 62", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A285612 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A285612() {
    super(0, new long[] {1, 0, -1, 0, 10},
      new long[] {1, -1, -10, 10});
  }
}
