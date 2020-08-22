package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A267226 Number of length-n 0..2 arrays with no following elements greater than or equal to the first repeated value.
 * @author Georg Fischer
 */
public class A267226 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267226() {
    super(1, new long[] {0, 3, -6, 0, 2},
      new long[] {1, -5, 8, -4});
  }
}
