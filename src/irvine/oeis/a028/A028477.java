package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A028477 Number of perfect matchings in graph C_{6} X P_{n}.
 * @author Georg Fischer
 */
public class A028477 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028477() {
    super(0, new long[] {-1, 2, 4, -2, -1},
      new long[] {-1, 4, 16, -6, -16, 4, 1});
  }
}
