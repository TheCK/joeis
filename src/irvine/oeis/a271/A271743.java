package irvine.oeis.a271;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A271743 Number of set partitions of [n] such that 4 is the largest element of the last block.
 * @author Georg Fischer
 */
public class A271743 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A271743() {
    super(4, new long[] {0, 0, 0, 0, 10, -45, 49, -6},
      new long[] {1, -6, 11, -6});
  }
}
