package irvine.oeis.a055;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A055900 Column 4 of triangle A055898.
 * @author Georg Fischer
 */
public class A055900 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A055900() {
    super(4, new long[] {0, 0, 0, 0, 1, 3, 9, 9, 9, 3, 1},
      new long[] {1, -6, 12, -2, -27, 36, 0, -36, 27, 2, -12, 6, -1});
  }
}
