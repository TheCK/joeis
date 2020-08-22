package irvine.oeis.a323;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A323799 Number of permutations p of [n] such that max_{j=1..n} |p(j)-j| = 3.
 * @author Georg Fischer
 */
public class A323799 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A323799() {
    super(3, new long[] {0, 0, 0, 0, -10, -7, 11, 11, -5, -4, -4, 4, 1, -3, 1, 1},
      new long[] {-1, 4, -2, -2, 6, -17, -16, -30, 6, 32, 48, 12, -16, -16, -9, 
      2, -2, -2, 2, 1});
  }
}
