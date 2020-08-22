package irvine.oeis.a223;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A223772 Number of n X 3 0..1 arrays with rows and columns unimodal and antidiagonals nondecreasing.
 * @author Georg Fischer
 */
public class A223772 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A223772() {
    super(1, new long[] {0, 7, -21, 29, -23, 14, -7, 2},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
