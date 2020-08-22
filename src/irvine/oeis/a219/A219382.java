package irvine.oeis.a219;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A219382 Number of 2 X n arrays of the minimum value of corresponding elements and their horizontal, diagonal or antidiagonal neighbors in a random, but sorted with lexicographically nondecreasing rows and columns, 0..2 2 X n array.
 * @author Georg Fischer
 */
public class A219382 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A219382() {
    super(1, new long[] {0, 6, -23, 39, -35, 15, 5, -14, 13, -6, 1},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
