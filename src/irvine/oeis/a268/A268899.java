package irvine.oeis.a268;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A268899 Number of n X 3 0..2 arrays with some element plus some horizontally or antidiagonally adjacent neighbor totalling two exactly once.
 * @author Georg Fischer
 */
public class A268899 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A268899() {
    super(1, new long[] {0, 12, 24},
      new long[] {1, -12, 36});
  }
}
