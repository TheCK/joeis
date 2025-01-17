package irvine.oeis.a219;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A219756 Expansion of  x^4*(1-7*x+17*x^2-18*x^3+11*x^4-5*x^5)/((1-x)^2*(1-3*x)^2*(1-3*x+x^2)^2).
 * @author Georg Fischer
 */
public class A219756 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A219756() {
    super(0, new long[] {0, 0, 0, 0, 1, -7, 17, -18, 11, -5},
      new long[] {1, -14, 81, -250, 444, -458, 265, -78, 9});
  }
}
