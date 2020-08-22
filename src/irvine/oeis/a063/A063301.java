package irvine.oeis.a063;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A063301 Dimension of the space of weight n cuspidal newforms for Gamma_1( 28 ).
 * @author Georg Fischer
 */
public class A063301 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A063301() {
    super(2, new long[] {0, 0, -1, 8, 22, 36, 49, 54, 53, 48, 30, 20, 3},
      new long[] {1, 0, 0, 0, -1, 0, -1, 0, 0, 0, 1});
  }
}
