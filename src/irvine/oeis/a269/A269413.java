package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A269413 Number of length-7 0..n arrays with no repeated value greater than or equal to the previous repeated value.
 * @author Georg Fischer
 */
public class A269413 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A269413() {
    super(1, new long[] {0, 20, 797, 3036, 1510, -296, -27},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
