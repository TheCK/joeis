package irvine.oeis.a306;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A306262 Difference between maximum and minimum sum of products of successive pairs in permutations of [n].
 * @author Georg Fischer
 */
public class A306262 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A306262() {
    super(0, new long[] {0, 0, 0, 4, -1, -1},
      new long[] {1, -3, 2, 2, -3, 1});
  }
}
