package irvine.oeis.a320;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A320553 Number of set partitions of [n] such that for each block b the smallest integer interval containing b has at most three elements and for at least one block c the smallest integer interval containing c has exactly three elements.
 * @author Georg Fischer
 */
public class A320553 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A320553() {
    super(3, new long[] {0, 0, 0, 2, 1},
      new long[] {1, -2, -1, 0, 2, 3, 1});
  }
}
