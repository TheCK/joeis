package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A267234 Number of length-5 0..n arrays with no following elements greater than or equal to the first repeated value.
 * @author Georg Fischer
 */
public class A267234 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267234() {
    super(1, new long[] {0, 7, 61, 51, 1},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
