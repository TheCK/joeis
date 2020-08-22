package irvine.oeis.a078;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A078029 Expansion of (1-x)/(1-2*x^3).
 * @author Georg Fischer
 */
public class A078029 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A078029() {
    super(0, new long[] {1, -1},
      new long[] {1, 0, 0, -2});
  }
}
