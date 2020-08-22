package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A267472 Number of length-4 0..n arrays with no following elements larger than the first repeated value.
 * @author Georg Fischer
 */
public class A267472 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267472() {
    super(1, new long[] {0, 12, 2, 14, -5, 1},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
