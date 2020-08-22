package irvine.oeis.a105;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A105964 Expansion of x*(1+x^3-x^6+x^7)/(1-x^6)^2.
 * @author Georg Fischer
 */
public class A105964 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A105964() {
    super(0, new long[] {0, 1, 0, 0, 1, 0, 0, -1, 1},
      new long[] {1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 1});
  }
}
