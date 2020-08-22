package irvine.oeis.a172;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A172158 Number of ways to place 6 nonattacking kings on an n X n board.
 * @author Georg Fischer
 */
public class A172158 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A172158() {
    super(1, new long[] {0, 0, 0, 0, 0, -978, -49552, -487124, -746496, 574194, 526280, 
      -753984, 324112, -72206, 41784, -29244, 8864, -930},
      new long[] {-1, 13, -78, 286, -715, 1287, -1716, 1716, -1287, 715, -286, 78, 
      -13, 1});
  }
}
