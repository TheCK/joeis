package irvine.oeis.a219;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A219774 Number of 3 X n arrays of the minimum value of corresponding elements and their horizontal or antidiagonal neighbors in a random, but sorted with lexicographically nondecreasing rows and columns, 0..1 3 X n array.
 * @author Georg Fischer
 */
public class A219774 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A219774() {
    super(1, new long[] {0, 4, -14, 24, -17, 0, 5, 3, -6, 2},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
