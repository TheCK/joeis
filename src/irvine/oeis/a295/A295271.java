package irvine.oeis.a295;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A295271 Number of nX4 0..1 arrays with each 1 horizontally or vertically adjacent to 0, 1 or 4 1s.
 * @author Georg Fischer
 */
public class A295271 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A295271() {
    super(1, new long[] {0, 13, 46, 68, -50, -116, -93, 31, -28, -60, 2, -73, 51, -22, 
      7, -1, 1},
      new long[] {1, -4, -27, -63, -14, 110, 43, 45, -89, 150, -89, 126, -72, 30, 
      -8, 2, -1});
  }
}
