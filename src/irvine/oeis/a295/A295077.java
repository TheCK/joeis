package irvine.oeis.a295;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A295077 a(n) = 2*n*(n-1) + 2^n - 1.
 * @author Georg Fischer
 */
public class A295077 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A295077() {
    super(0, new long[] {0, 1, 2, -7},
      new long[] {1, -5, 9, -7, 2});
  }
}
