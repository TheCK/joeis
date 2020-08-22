package irvine.oeis.a242;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A242509 Number of n-length words on {1,2,3,4,5} that contain at most one consecutive 1 and at most two consecutive 2's and at most three consecutive 3's and at most four consecutive 4's and at most five consecutive 5's.
 * @author Georg Fischer
 */
public class A242509 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A242509() {
    super(0, new long[] {1, 2, 4, 6, 8, 9, 9, 8, 6, 4, 2, 1},
      new long[] {1, -3, -5, -12, -17, -24, -24, -25, -19, -14, -7, -4});
  }
}
