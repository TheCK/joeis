package irvine.oeis.a224;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A224257 Number of n X 3 0..2 arrays with rows and antidiagonals unimodal and columns nondecreasing.
 * @author Georg Fischer
 */
public class A224257 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A224257() {
    super(1, new long[] {0, 22, 4, 4, 29, -25, 13, -1},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
