package irvine.oeis.a165;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A165372 Number of slanted n X 3 (i=1..n) X (j=i..3+i-1) 1..4 arrays with all 1s connected, all 2s connected, all 3s connected, all 4s connected, 1 in the upper left corner, 2 in the upper right corner, 3 in the lower left corner, and 4 in the lower right corner.
 * @author Georg Fischer
 */
public class A165372 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A165372() {
    super(2, new long[] {0, 0, 9, 22, 33},
      new long[] {1, -2, 1});
  }
}
