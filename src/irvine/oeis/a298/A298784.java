package irvine.oeis.a298;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A298784 Expansion of (1 + x^2)*(1 + 3*x + x^2) / ((1 - x)*(1 - x^3)).
 * @author Georg Fischer
 */
public class A298784 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A298784() {
    super(0, new long[] {1, 3, 2, 3, 1},
      new long[] {1, -1, 0, -1, 1});
  }
}
