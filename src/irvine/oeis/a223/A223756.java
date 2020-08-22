package irvine.oeis.a223;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A223756 Number of n X 2 0..3 arrays with rows, antidiagonals and columns unimodal.
 * @author Georg Fischer
 */
public class A223756 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A223756() {
    super(1, new long[] {0, 16, 48, 420, -208, 1140, -1260, 1401, -1044, 597, -244, 69, 
      -12, 1},
      new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 
      13, -1});
  }
}
