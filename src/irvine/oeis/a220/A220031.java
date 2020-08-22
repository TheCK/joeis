package irvine.oeis.a220;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A220031 Number of n X 7 arrays of the minimum value of corresponding elements and their horizontal or diagonal neighbors in a random, but sorted with lexicographically nondecreasing rows and nonincreasing columns, 0..1 n X 7 array.
 * @author Georg Fischer
 */
public class A220031 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A220031() {
    super(1, new long[] {0, 7, -31, 76, -115, 113, -66, 17, 1, -1},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
