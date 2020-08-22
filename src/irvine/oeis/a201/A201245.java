package irvine.oeis.a201;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A201245 Number of ways to place 4 non-attacking ferses on an n X n board.
 * @author Georg Fischer
 */
public class A201245 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A201245() {
    super(1, new long[] {0, 0, 0, -29, -400, -1380, -173, 225, 254, -230, 55, -2},
      new long[] {-1, 9, -36, 84, -126, 126, -84, 36, -9, 1});
  }
}
