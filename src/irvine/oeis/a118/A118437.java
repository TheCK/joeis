package irvine.oeis.a118;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A118437 Row sums of triangle A118435.
 * @author Georg Fischer
 */
public class A118437 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A118437() {
    super(0, new long[] {1, 0, 0, 8, 0, -32, 384, -256},
      new long[] {1, -2, 4, -8, 64, -128, 256, -512});
  }
}
