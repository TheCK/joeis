package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A267184 Row 4 of the square array in A267181.
 * @author Georg Fischer
 */
public class A267184 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267184() {
    super(0, new long[] {1, 3, -2, 3, -6, 2},
      new long[] {1, -1, 0, 0, -1, 1});
  }
}
