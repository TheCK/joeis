package irvine.oeis.a268;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A268972 Number of 2 X n 0..2 arrays with some element plus some horizontally or antidiagonally adjacent neighbor totalling two not more than once.
 * @author Georg Fischer
 */
public class A268972 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A268972() {
    super(1, new long[] {0, 9, 6, -39, 12},
      new long[] {1, -6, 9});
  }
}
