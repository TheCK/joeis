package irvine.oeis.a215;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A215628 Number of terms in 10th derivative of a function composed with itself n times.
 * @author Georg Fischer
 */
public class A215628 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A215628() {
    super(1, new long[] {0, 1, 32, -30, -83, 161, -110, 34, -4},
      new long[] {1, -10, 45, -120, 210, -252, 210, -120, 45, -10, 1});
  }
}
