package irvine.oeis.a301;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A301383 Expansion of (1 + 3*x - 2*x^2)/(1 - 7*x + 7*x^2 - x^3).
 * @author Georg Fischer
 */
public class A301383 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A301383() {
    super(0, new long[] {1, 3, -2},
      new long[] {1, -7, 7, -1});
  }
}
