package irvine.oeis.a055;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A055822 a(n) = T(n, n-5), array T as in A055818.
 * @author Georg Fischer
 */
public class A055822 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A055822() {
    super(5, new long[] {0, 0, 0, 0, 0, 1, 41, -123, 149, -93, 30, -4},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
