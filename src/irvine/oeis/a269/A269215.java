package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A269215 Number of 2 X n 0..3 arrays with some element plus some horizontally, diagonally or antidiagonally adjacent neighbor totalling three exactly once.
 * @author Georg Fischer
 */
public class A269215 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A269215() {
    super(1, new long[] {0, 0, 96, -192, 96},
      new long[] {1, -10, 13, 60, 36});
  }
}
