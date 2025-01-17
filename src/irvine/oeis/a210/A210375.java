package irvine.oeis.a210;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A210375 Number of 2 X 2 matrices with all terms in {0,1,...,n} and (sum of terms) = n + 3.
 * @author Georg Fischer
 */
public class A210375 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A210375() {
    super(0, new long[] {0, 1, 12, -14, -4, 6},
      new long[] {1, -4, 6, -4, 1});
  }
}
