package irvine.oeis.a164;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A164913 Expansion of x/(1-9*x-11*x^2+10*x^3).
 * @author Georg Fischer
 */
public class A164913 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A164913() {
    super(1, new long[] {0, 1},
      new long[] {1, -9, -11, 10});
  }
}
