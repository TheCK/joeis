package irvine.oeis.a136;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A136444 a(n) = Sum_{k=0..n} k*binomial(n-k, 2*k).
 * @author Georg Fischer
 */
public class A136444 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A136444() {
    super(0, new long[] {0, 0, 0, 1, -1},
      new long[] {1, -4, 6, -6, 5, -2, 1});
  }
}
