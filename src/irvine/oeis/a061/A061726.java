package irvine.oeis.a061;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A061726 If n-th triangular number (A000217(n)) is odd, multiply it by 4; if even, multiply it by 5.
 * @author Georg Fischer
 */
public class A061726 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A061726() {
    super(1, new long[] {0, -4, 0, -18, 8, -18, 0, -4},
      new long[] {-1, 3, -6, 10, -12, 12, -10, 6, -3, 1});
  }
}
