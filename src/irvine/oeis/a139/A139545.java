package irvine.oeis.a139;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A139545 Binomial transform of [1, 0, 0, 4, 0, 0, 7, 0, 0, 10, ...].
 * @author Georg Fischer
 */
public class A139545 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A139545() {
    super(1, new long[] {0, 1, -5, 10, -8, 1, 1},
      new long[] {1, -6, 15, -22, 21, -12, 4});
  }
}
