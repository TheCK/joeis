package irvine.oeis.a250;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A250142 Number of length 3+2 0..n arrays with the medians of every three consecutive terms nondecreasing.
 * @author Georg Fischer
 */
public class A250142 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A250142() {
    super(1, new long[] {0, 24, 18, 20, -15, 6, -1},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
