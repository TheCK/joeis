package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A269285 Number of n X 4 0..3 arrays with some element plus some horizontally or antidiagonally adjacent neighbor totalling three no more than once.
 * @author Georg Fischer
 */
public class A269285 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A269285() {
    super(1, new long[] {0, 216, -1980, 1764},
      new long[] {1, -98, 2401});
  }
}
