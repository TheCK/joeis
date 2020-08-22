package irvine.oeis.a122;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A122589 Expansion of 1 / (x^6-21*x^5+70*x^4-84*x^3+45*x^2-11*x+1).
 * @author Georg Fischer
 */
public class A122589 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A122589() {
    super(0, new long[] {1},
      new long[] {1, -11, 45, -84, 70, -21, 1});
  }
}
