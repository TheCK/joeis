package irvine.oeis.a288;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A288382 Positions of 0 in A288381; complement of A288383.
 * @author Georg Fischer
 */
public class A288382 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A288382() {
    super(1, new long[] {0, 1, -2, 0, 1, -1},
      new long[] {1, -4, 5, -2});
  }
}
