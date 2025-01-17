package irvine.oeis.a133;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A133381 Expansion of g.f. -x^2*(2835*x^2-1032*x-1)/(3149685*x^3+88636*x^2-1037*x-1).
 * @author Georg Fischer
 */
public class A133381 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A133381() {
    super(1, new long[] {0, 0, 1, 1032, -2835},
      new long[] {-1, -1037, 88636, 3149685});
  }
}
