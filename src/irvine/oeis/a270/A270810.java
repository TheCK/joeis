package irvine.oeis.a270;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A270810 Expansion of (x - x^2 + 2*x^3 + 2*x^4)/(1 - 3*x + 2*x^2).
 * @author Georg Fischer
 */
public class A270810 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A270810() {
    super(0, new long[] {0, 1, -1, 2, 2},
      new long[] {1, -3, 2});
  }
}
