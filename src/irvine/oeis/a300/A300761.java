package irvine.oeis.a300;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A300761 Number of non-equivalent ways (mod D_2) to select 4 points from n equidistant points on a straight line so that no selected point is equally distant from two other selected points.
 * @author Georg Fischer
 */
public class A300761 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A300761() {
    super(4, new long[] {0, 0, 0, 0, 0, 1, 1, 0, 4, 1, 5},
      new long[] {1, -2, 0, 1, 0, 2, -2, 0, -1, 0, 2, -1});
  }
}
