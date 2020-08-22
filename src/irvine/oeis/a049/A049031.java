package irvine.oeis.a049;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A049031 Maximization of sums of cubes of integer differences (b_[ i ]-i)^3 over permutations {b_[ i ], for i-1,2,...,n} on first n integers.
 * @author Georg Fischer
 */
public class A049031 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A049031() {
    super(1, new long[] {0, 0, 0, 2, 4, 6, 8, 14, 8, 6, 4, 2},
      new long[] {1, -2, 1, 0, -3, 6, -3, 0, 3, -6, 3, 0, -1, 2, -1});
  }
}
