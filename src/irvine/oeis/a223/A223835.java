package irvine.oeis.a223;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A223835 Number of n X 5 0..1 arrays with rows and antidiagonals unimodal and columns nondecreasing.
 * @author Georg Fischer
 */
public class A223835 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A223835() {
    super(1, new long[] {0, 16, -10, -21, 36, 9, -18, 2, 2},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
