package irvine.oeis.a224;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A224042 Number of 6 X n 0..1 arrays with antidiagonals unimodal and rows and diagonals nondecreasing.
 * @author Georg Fischer
 */
public class A224042 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A224042() {
    super(1, new long[] {0, 64, -71, -447, 1163, -952, 97, 216, -72, 33, -45, 15},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
