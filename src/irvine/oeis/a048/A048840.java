package irvine.oeis.a048;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A048840 Expansion of (1 - x + 2*x^2 + 2*x^3 - x^4 - x^5)/(1-x)^3.
 * @author Georg Fischer
 */
public class A048840 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A048840() {
    super(0, new long[] {1, -1, 2, 2, -1, -1},
      new long[] {1, -3, 3, -1});
  }
}
