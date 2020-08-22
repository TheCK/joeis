package irvine.oeis.a119;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A119327 Expansion of (1-4x+12x^2-16x^3+8x^4)/(1-x)^5.
 * @author Georg Fischer
 */
public class A119327 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A119327() {
    super(0, new long[] {1, -4, 12, -16, 8},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
