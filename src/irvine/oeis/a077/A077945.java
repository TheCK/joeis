package irvine.oeis.a077;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A077945 Expansion of 1/(1-2*x+2*x^2+2*x^3).
 * @author Georg Fischer
 */
public class A077945 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A077945() {
    super(0, new long[] {1},
      new long[] {1, -2, 2, 2});
  }
}
