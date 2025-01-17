package irvine.oeis.a035;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A035287 Number of ways to place a non-attacking white and black rook on n X n chessboard.
 * @author Georg Fischer
 */
public class A035287 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A035287() {
    super(1, new long[] {0, 0, 4, 16, 4},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
