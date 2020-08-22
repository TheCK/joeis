package irvine.oeis.a107;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A107363 Expansion of (1 - x)*(1 + x)^2*(1 + x^2)*(1 - x^2 + 2*x^3 + x^4) / ((1 - x^2 - x^4)*(1 + x^2 + 2*x^4 - x^6 + x^8)).
 * @author Georg Fischer
 */
public class A107363 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A107363() {
    super(0, new long[] {-1, -1, 1, -1, -2, 0, -1, 1, 3, 1},
      new long[] {-1, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 1});
  }
}
