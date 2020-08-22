package irvine.oeis.a063;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A063283 Dimension of the space of weight n cuspidal newforms for Gamma_1( 10 ).
 * @author Georg Fischer
 */
public class A063283 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A063283() {
    super(2, new long[] {0, 0, -1, 0, 2, 3, 5, 5, 5, 2, 2, -1, -1, 1},
      new long[] {1, 0, 0, 0, -1, 0, -1, 0, 0, 0, 1});
  }
}
