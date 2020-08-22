package irvine.oeis.a190;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A190569 Number of n-step one-sided prudent walks, avoiding single west steps and single east steps.
 * @author Georg Fischer
 */
public class A190569 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A190569() {
    super(1, new long[] {1, -1, 2},
      new long[] {1, -2, 1, -2});
  }
}
