package irvine.oeis.a299;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A299336 Expansion of 1 / ((1 - x)^7*(1 + x)^4).
 * @author Georg Fischer
 */
public class A299336 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A299336() {
    super(0, new long[] {1},
      new long[] {1, -3, -1, 11, -6, -14, 14, 6, -11, 1, 3, -1});
  }
}
