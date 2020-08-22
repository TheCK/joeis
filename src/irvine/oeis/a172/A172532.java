package irvine.oeis.a172;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A172532 Number of ways to place 5 nonattacking knights on an n X n toroidal board.
 * @author Georg Fischer
 */
public class A172532 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A172532() {
    super(1, new long[] {0, 0, 0, 0, -128, 1288, -36032, 64046, -438698, 1355704, -2753560, 
      4370014, -5651642, 5934236, -4985484, 3280176, -1637024, 591144, -143640, 
      20656, -1296},
      new long[] {-1, 11, -55, 165, -330, 462, -462, 330, -165, 55, -11, 1});
  }
}
