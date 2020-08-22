package irvine.oeis.a078;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A078023 Expansion of (1-x)/(1-2*x^2-2*x^3).
 * @author Georg Fischer
 */
public class A078023 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A078023() {
    super(0, new long[] {1, -1},
      new long[] {1, 0, -2, -2});
  }
}
