package irvine.oeis.a251;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A251130 Number of (n+1) X (1+1) 0..2 arrays with no 2 X 2 subblock having the sum of its diagonal elements greater than the maximum of its antidiagonal elements.
 * @author Georg Fischer
 */
public class A251130 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A251130() {
    super(1, new long[] {0, 40, -67, 24, 58, -60, 17},
      new long[] {1, -5, 8, -2, -7, 7, -2});
  }
}
