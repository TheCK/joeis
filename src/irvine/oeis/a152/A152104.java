package irvine.oeis.a152;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A152104 Quartic product sequence: a(n) = 2^n*Product_{k=1..(n-1)/2} (1 + m*cos(k*Pi/n)^2 + q*cos(k*Pi/n)^4), with m=6, q=4.
 * @author Georg Fischer
 */
public class A152104 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A152104() {
    super(0, new long[] {1, 0, -8, -4, 1},
      new long[] {1, -2, -8, -2, 1});
  }
}
