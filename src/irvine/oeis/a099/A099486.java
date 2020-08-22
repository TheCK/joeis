package irvine.oeis.a099;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A099486 Expansion of x/((1 + x^2)*(1 - 4*x + x^2)).
 * @author Georg Fischer
 */
public class A099486 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A099486() {
    super(0, new long[] {0, 1},
      new long[] {1, -4, 2, -4, 1});
  }
}
