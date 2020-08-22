package irvine.oeis.a294;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A294701 Number of permutations of n avoiding {4231, 2143, 1342}.
 * @author Georg Fischer
 */
public class A294701 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A294701() {
    super(0, new long[] {1, -6, 14, -14, 8, 0, -2},
      new long[] {1, -7, 19, -25, 16, -4});
  }
}
