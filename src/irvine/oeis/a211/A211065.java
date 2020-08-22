package irvine.oeis.a211;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A211065 Number of 2 X 2 matrices having all terms in {1,...,n} and odd determinant.
 * @author Georg Fischer
 */
public class A211065 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A211065() {
    super(1, new long[] {0, 0, -6, -34, -32, -56, -10, -6},
      new long[] {-1, 1, 4, -4, -6, 6, 4, -4, -1, 1});
  }
}
