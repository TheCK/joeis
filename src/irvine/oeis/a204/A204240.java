package irvine.oeis.a204;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A204240 Determinant of the n-th principal submatrix of A204158.
 * @author Georg Fischer
 */
public class A204240 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A204240() {
    super(1, new long[] {0, 1, -4},
      new long[] {1, 10, 25});
  }
}
