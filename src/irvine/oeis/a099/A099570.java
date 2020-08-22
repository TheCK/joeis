package irvine.oeis.a099;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A099570 Expansion of ((1+x)^2-x^3)/(1+x)^2.
 * @author Georg Fischer
 */
public class A099570 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A099570() {
    super(0, new long[] {1, 2, 1, -1},
      new long[] {1, 2, 1});
  }
}
