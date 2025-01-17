package irvine.oeis.a022;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A022473 Number of 2's in n-th term of A022470.
 * @author Sean A. Irvine
 */
public class A022473 extends GeneratingFunctionSequence {

  // After Peter J. C. Moses

  /** Construct the sequence. */
  public A022473() {
    super(new long[] {-1, 0, 1, 2, 0, -3, -2, 1, 3, 3, -2, -2, 1, -2, -7, 1, 1, 18, -2, 0, -16, 4, 8, -19, 7, -7, 16, 24, -28, -3, -11, -3, 33, -12, 15, -9, 6, -22, -6, -22, 25, 12, 27, -25, -1, -10, 11, -19, 18, -16, 37, -18, -19, 7, -2, 18, -19, 2, -11, 29, -21, 19, -14, 17, -14, 16, -23, 14, -19, 17, -10, 11, -6},
      new long[] {-1, 1, 1, 1, -1, -3, 0, 1, 2, 0, 0, 0, 0, -3, -3, 2, 5, 8, -7, -1, -8, 0, 5, -8, 12, 4, 1, 0, -18, 4, -2, 13, 7, -19, 14, -14, 6, 4, -13, 9, 7, -4, 8, -7, -5, -7, 12, -17, 22, -8, 7, -16, 6, 7, 6, -3, -19, 5, 5, 14, -8, -2, -7, 5, -1, 8, -14, 11, -16, 18, -9, 9, -6});
  }
}
