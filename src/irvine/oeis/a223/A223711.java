package irvine.oeis.a223;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A223711 Number of n X 2 0..1 arrays with row sums and column sums unimodal.
 * @author Georg Fischer
 */
public class A223711 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A223711() {
    super(1, new long[] {0, 4, -12, 17, -12, 4},
      new long[] {1, -7, 19, -25, 16, -4});
  }
}
