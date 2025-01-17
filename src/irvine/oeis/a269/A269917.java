package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A269917 Number of ternary strings of length n with maximal run length five containing 111112.
 * @author Georg Fischer
 */
public class A269917 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A269917() {
    super(6, new long[] {0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
      new long[] {1, -3, -3, 1, 9, 21, 41, 59, 69, 71, 65, 50, 32, 18, 8, 2});
  }
}
