package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A269587 Number of length-7 0..n arrays with no repeated value differing from the previous repeated value by more than one.
 * @author Georg Fischer
 */
public class A269587 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A269587() {
    super(1, new long[] {0, 128, 865, 2418, 1919, -116, -129, -46, 1},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
