package irvine.oeis.a223;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A223633 Number of n X 4 0..1 arrays with rows, antidiagonals and columns unimodal.
 * @author Georg Fischer
 */
public class A223633 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A223633() {
    super(1, new long[] {0, 11, 22, 108, -65, 249, -74, 92, 18, 9, -11, 1},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
