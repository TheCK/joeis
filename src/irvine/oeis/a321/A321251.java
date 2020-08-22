package irvine.oeis.a321;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A321251 a(n) is the number of ways to place non-attacking knights on a 3 X n chessboard.
 * @author Georg Fischer
 */
public class A321251 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A321251() {
    super(0, new long[] {1, 5, 8, -36, -92, 98, 78, 30, 256, -270, -250, 120, -72, 60, 
      72, -36},
      new long[] {1, -3, -4, 10, -24, 78, 26, -168, 108, -174, -70, 376, -144, 
      24, 48, -108, 36});
  }
}
