package irvine.oeis.a220;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A220037 Number of 7 X n arrays of the minimum value of corresponding elements and their horizontal or diagonal neighbors in a random, but sorted with lexicographically nondecreasing rows and nonincreasing columns, 0..1 7 X n array.
 * @author Georg Fischer
 */
public class A220037 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A220037() {
    super(1, new long[] {0, 8, -42, 106, -119, 10, 108, -123, 58, 36, -68, 33, -10, -2, 
      10, -3, -1},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
