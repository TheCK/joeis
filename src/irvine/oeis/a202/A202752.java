package irvine.oeis.a202;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A202752 Number of n X 4 nonnegative integer arrays with each row and column increasing from zero by 0 or 1.
 * @author Georg Fischer
 */
public class A202752 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A202752() {
    super(1, new long[] {0, 1, -3, 10, -8, 2},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
