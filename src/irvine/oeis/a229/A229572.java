package irvine.oeis.a229;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A229572 Number of defective 4-colorings of an n X 2 0..3 array connected horizontally, vertically, diagonally and antidiagonally with exactly one mistake, and colors introduced in row-major 0..3 order.
 * @author Georg Fischer
 */
public class A229572 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A229572() {
    super(1, new long[] {0, 1, 2, 6},
      new long[] {1, -4, 4});
  }
}
