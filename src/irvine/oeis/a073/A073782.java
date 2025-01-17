package irvine.oeis.a073;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A073782 a(n) = Sum_{k=0..n} S(k)*S(n-k), convolution of S=A001644 with itself.
 * @author Georg Fischer
 */
public class A073782 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A073782() {
    super(0, new long[] {9, -12, -2, 4, 1},
      new long[] {1, -2, -1, 0, 3, 2, 1});
  }
}
