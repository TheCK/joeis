package irvine.oeis.a223;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A223833 Number of n X 3 0..1 arrays with rows and antidiagonals unimodal and columns nondecreasing.
 * @author Georg Fischer
 */
public class A223833 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A223833() {
    super(1, new long[] {0, 7, -6, 2, 1},
      new long[] {1, -4, 6, -4, 1});
  }
}
