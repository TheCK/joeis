package irvine.oeis.a054;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A054128 T(n,2), array T as in A054126.
 * @author Georg Fischer
 */
public class A054128 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A054128() {
    super(2, new long[] {0, 0, 2, -5, 10, -10, 5, -1},
      new long[] {1, -6, 14, -16, 9, -2});
  }
}
