package irvine.oeis.a194;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A194605 Number of ways to place 2 nonattacking kings on an n X n X n X n raumschach board (four-dimensional chessboard).
 * @author Georg Fischer
 */
public class A194605 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A194605() {
    super(0, new long[] {0, 0, 0, 2080, 9048, 6000, 2680, 600, -240, -8},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
