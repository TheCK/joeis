package irvine.oeis.a268;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A268775 Number of n X 2 binary arrays with some element plus some horizontally, vertically, diagonally or antidiagonally adjacent neighbor totalling two no more than once.
 * @author Georg Fischer
 */
public class A268775 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A268775() {
    super(1, new long[] {0, 4, 3, -8, -4},
      new long[] {1, -2, -3, 4, 4});
  }
}
