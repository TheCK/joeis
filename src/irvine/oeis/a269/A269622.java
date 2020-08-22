package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A269622 Number of length-6 0..n arrays with no repeated value differing from the previous repeated value by other than plus two, zero or minus 1.
 * @author Georg Fischer
 */
public class A269622 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A269622() {
    super(1, new long[] {0, 51, 267, 314, 167, -86, 17, -14, 5, -1},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
