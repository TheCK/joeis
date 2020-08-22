package irvine.oeis.a076;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A076616 Number of permutations of {1,2,...,n} that result in a binary search tree (when elements of the permutation are inserted in that order) of height n-1 (i.e., the second largest possible height).
 * @author Georg Fischer
 */
public class A076616 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A076616() {
    super(0, new long[] {0, 0, 0, -2, -4, 8},
      new long[] {-1, 6, -12, 8});
  }
}
