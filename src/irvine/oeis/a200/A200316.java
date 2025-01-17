package irvine.oeis.a200;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A200316 Number of permutations of [1..n] that can be drawn on a circle.
 * @author Georg Fischer
 */
public class A200316 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A200316() {
    super(1, new long[] {0, -1, 5, -9, 5, -4, 2},
      new long[] {-1, 7, -17, 19, -10, 2});
  }
}
