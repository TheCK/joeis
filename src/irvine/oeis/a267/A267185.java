package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A267185 Column 2 of the square array in A267181.
 * @author Georg Fischer
 */
public class A267185 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267185() {
    super(0, new long[] {0, 1, -1, 3, -1, -1},
      new long[] {1, -1, -1, 1});
  }
}
