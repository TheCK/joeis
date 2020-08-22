package irvine.oeis.a172;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A172138 Number of ways to place 3 nonattacking zebras on an n X n board.
 * @author Georg Fischer
 */
public class A172138 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A172138() {
    super(1, new long[] {0, 0, -4, -56, 52, -232, 116, 36, -4, -132, 180, -92, 16},
      new long[] {-1, 7, -21, 35, -35, 21, -7, 1});
  }
}
