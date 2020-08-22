package irvine.oeis.a063;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A063278 Dimension of the space of weight n cuspidal newforms for Gamma_1( 5 ).
 * @author Georg Fischer
 */
public class A063278 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A063278() {
    super(2, new long[] {0, 0, -1, 0, 0, 1, 3, 3, 5, 4, 4, 3, 1, -1},
      new long[] {1, 0, 0, 0, -1, 0, -1, 0, 0, 0, 1});
  }
}
