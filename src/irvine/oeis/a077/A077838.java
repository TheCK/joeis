package irvine.oeis.a077;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A077838 Expansion of (1-x)/(1-3*x-2*x^2-3*x^3).
 * @author Georg Fischer
 */
public class A077838 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A077838() {
    super(0, new long[] {1, -1},
      new long[] {1, -3, -2, -3});
  }
}
