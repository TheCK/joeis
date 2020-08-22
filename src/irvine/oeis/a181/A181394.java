package irvine.oeis.a181;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A181394 Summed lengths of all nonintersecting rook paths on a 3 x n board.
 * @author Georg Fischer
 */
public class A181394 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A181394() {
    super(1, new long[] {0, 2, -2, -4, 24, -4, 4, -4},
      new long[] {1, -8, 22, -28, 23, -4, -2, 4, 1});
  }
}
