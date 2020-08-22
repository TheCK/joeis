package irvine.oeis.a233;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A233167 Number of n X 7 0..7 arrays with no element x(i,j) adjacent to itself or value 7-x(i,j) horizontally, diagonally, antidiagonally or vertically, top left element zero, and 1 appearing before 2 3 4 5 and 6, 2 appearing before 3 4 and 5, and 3 appearing before 4 in row major order (unlabelled 8-colorings with no clashing color pairs).
 * @author Georg Fischer
 */
public class A233167 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A233167() {
    super(1, new long[] {0, 1248, -446464, 32636928},
      new long[] {1, -384, 32768});
  }
}
