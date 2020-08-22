package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A267317 a(n) = final digit of 2^n-1.
 * @author Georg Fischer
 */
public class A267317 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A267317() {
    super(0, new long[] {0, 1, 2, 5},
      new long[] {1, -1, 1, -1});
  }
}
