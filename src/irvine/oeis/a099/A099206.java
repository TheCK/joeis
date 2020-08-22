package irvine.oeis.a099;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A099206 Expansion of x^2*(2*x^11+2*x^9+2*x^8+x^7+2*x^6+x^5+x^4+x^3-x^2-x-1) / (x^9+x^6+2*x^3-1).
 * @author Georg Fischer
 */
public class A099206 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A099206() {
    super(1, new long[] {0, 0, -1, -1, -1, 1, 1, 1, 2, 1, 2, 2, 0, 2},
      new long[] {-1, 0, 0, 2, 0, 0, 1, 0, 0, 1});
  }
}
