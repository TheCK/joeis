package irvine.oeis.a130;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A130812 If X_1,...,X_n is a partition of a 2n-set X into 2-blocks then a(n) is equal to the number of 6-subsets of X containing none of X_i, (i=1,...n).
 * @author Georg Fischer
 */
public class A130812 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A130812() {
    super(6, new long[] {0, 0, 0, 0, 0, 0, 64},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
