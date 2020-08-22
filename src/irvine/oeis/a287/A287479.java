package irvine.oeis.a287;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A287479 Expansion of (x + x^2)/(1 + 3*x^2).
 * @author Georg Fischer
 */
public class A287479 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A287479() {
    super(0, new long[] {0, 1, 1},
      new long[] {1, 0, 3});
  }
}
