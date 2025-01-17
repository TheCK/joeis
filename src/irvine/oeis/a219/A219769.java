package irvine.oeis.a219;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A219769 Number of n X 4 arrays of the minimum value of corresponding elements and their horizontal or antidiagonal neighbors in a random, but sorted with lexicographically nondecreasing rows and columns, 0..1 n X 4 array.
 * @author Georg Fischer
 */
public class A219769 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A219769() {
    super(1, new long[] {0, 4, -27, 96, -209, 319, -357, 305, -190, 94, -54, 35, -12, 
      -1, 1},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
