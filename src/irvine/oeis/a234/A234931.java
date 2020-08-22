package irvine.oeis.a234;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A234931 Number of tilings of a 5 X n rectangle using n pentominoes of shapes F, U, N.
 * @author Georg Fischer
 */
public class A234931 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A234931() {
    super(0, new long[] {-1, 2, 0, 0, -1, -2, 2, -2, 6, -2, 3, -2, -5, 4, -3, 0, 8, 
      0, 4, 0, 4},
      new long[] {-1, 2, 0, 0, 1, -6, 2, -2, 8, 2, 7, -14, -9, -8, 7, 4, 26, 
      8, -6, 0, -28, 0, -8});
  }
}
