package irvine.oeis.a299;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A299338 Expansion of 1 / ((1 - x)^7*(1 + x)^6).
 * @author Georg Fischer
 */
public class A299338 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A299338() {
    super(0, new long[] {1},
      new long[] {1, -1, -6, 6, 15, -15, -20, 20, 15, -15, -6, 6, 1, -1});
  }
}
