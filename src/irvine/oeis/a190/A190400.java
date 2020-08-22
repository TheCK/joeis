package irvine.oeis.a190;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A190400 Number of ways to place 5 nonattacking grasshoppers on a toroidal chessboard of size n x n.
 * @author Georg Fischer
 */
public class A190400 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A190400() {
    super(1, new long[] {0, 0, 0, 0, -976, -12654, -100228, -218140, -394716, -122896, -26620, 
      -67818, -66016, 72158, -11372, -47392, 32340, 8564, -17556, 4390, 
      2712, -1748, 288},
      new long[] {-1, 6, -10, -10, 50, -34, -66, 110, 0, -110, 66, 34, -50, 10, 
      10, -6, 1});
  }
}
