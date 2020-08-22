package irvine.oeis.a255;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A255280 A255279(2^n-1).
 * @author Georg Fischer
 */
public class A255280 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A255280() {
    super(0, new long[] {1, 2, -7, 12, 0, -16, -16},
      new long[] {1, -5, 3, 9, -16, 0, 16, 16});
  }
}
