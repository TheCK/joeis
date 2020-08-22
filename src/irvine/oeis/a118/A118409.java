package irvine.oeis.a118;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A118409 Unsigned row sums of triangle A118407.
 * @author Georg Fischer
 */
public class A118409 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A118409() {
    super(0, new long[] {1, 0, 2, 2, -3, 2, -2},
      new long[] {1, -1, 0, 0, -3, 3, 0, 0, -4, 4});
  }
}
