package irvine.oeis.a285;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A285777 Decimal representation of the diagonal from the corner to the origin of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 89", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A285777 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A285777() {
    super(0, new long[] {1, 2, -4, 4, -1, 1, 4, -4},
      new long[] {1, 0, -5, 0, 4});
  }
}
