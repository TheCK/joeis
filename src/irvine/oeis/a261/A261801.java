package irvine.oeis.a261;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A261801 Number of 9-compositions of n: matrices with 9 rows of nonnegative integers with positive column sums and total element sum n.
 * @author Georg Fischer
 */
public class A261801 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A261801() {
    super(0, new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1},
      new long[] {1, -18, 72, -168, 252, -252, 168, -72, 18, -2});
  }
}
