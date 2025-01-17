package irvine.oeis.a306;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A306293 Number of binary words of length n such that in every prefix and in every suffix the number of 0's and the number of 1's differ by at most two.
 * @author Georg Fischer
 */
public class A306293 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A306293() {
    super(0, new long[] {1, 2, -4, -10, 0, 12, 11, 0, -4},
      new long[] {1, 0, -8, 0, 22, 0, -23, 0, 6});
  }
}
