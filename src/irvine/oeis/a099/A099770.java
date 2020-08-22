package irvine.oeis.a099;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A099770 Expansion of 1/((1-x)*(1-x^2)*(1-x^4)*(1-x^6)).
 * @author Georg Fischer
 */
public class A099770 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A099770() {
    super(0, new long[] {1},
      new long[] {1, -1, -1, 1, -1, 1, 0, 0, 1, -1, 1, -1, -1, 1});
  }
}
