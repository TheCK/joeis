package irvine.oeis.a226;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A226549 Number of squares in all tilings of a 6 X n rectangle using integer sided square tiles.
 * @author Georg Fischer
 */
public class A226549 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A226549() {
    super(0, new long[] {0, 6, 60, -48, -498, 70, 1550, 588, -1775, -2280, -341, 1944, 
      1156, 686, 683, 344, 239, -612, -964, -660, -35, 308, 203, 60, 
      4},
      new long[] {1, -6, -21, 84, 311, -34, -1249, -1474, 1024, 3820, 2692, -1652, 
      -3837, -2162, -684, -986, -111, 2422, 3354, 1516, -461, -720, -530, 
      -748, -610, -160, 156, 192, 97, 28, 4});
  }
}
