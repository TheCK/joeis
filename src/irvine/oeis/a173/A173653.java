package irvine.oeis.a173;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A173653 Partial sums of floor(n^2/10) (A056865).
 * @author Georg Fischer
 */
public class A173653 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A173653() {
    super(0, new long[] {0, 0, 0, 0, 1, 0, 0, 0, 1},
      new long[] {1, -3, 3, -1, 0, 0, 0, 0, 0, 0, -1, 3, -3, 1});
  }
}
