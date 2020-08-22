package irvine.oeis.a285;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A285541 Binary representation of the diagonal from the origin to the corner of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 35", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A285541 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A285541() {
    super(0, new long[] {1, 1, -11},
      new long[] {1, -10, -11, 110, 10, -100});
  }
}
