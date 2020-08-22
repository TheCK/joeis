package irvine.oeis.a274;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A274642 Numbers of the form 4^k*(8*j+7) that have exactly three partitions into four positive squares.
 * @author Georg Fischer
 */
public class A274642 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A274642() {
    super(1, new long[] {0, 28, 55, 60, -33, -128, -145, -204, -128, -12},
      new long[] {1, 0, 0, -4});
  }
}
