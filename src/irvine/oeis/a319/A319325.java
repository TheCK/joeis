package irvine.oeis.a319;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A319325 a(n) is the number of row convex polyglasses (polyiamonds which need only touch at corners) with n cells.
 * @author Georg Fischer
 */
public class A319325 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A319325() {
    super(1, new long[] {0, 2, -4, 0, 4, -2},
      new long[] {1, -7, 9, 1, -9, 3});
  }
}
