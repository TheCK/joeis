package irvine.oeis.a064;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A064055 Ninth column of quadrinomial coefficients.
 * @author Georg Fischer
 */
public class A064055 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A064055() {
    super(0, new long[] {3, 4, -16, 15, -6, 1},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
