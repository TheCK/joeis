package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A267078 Coefficient of x^0 in the minimal polynomial of the continued fraction [1^n,2^(1/3),1,1,...], where 1^n means n ones.
 * @author Georg Fischer
 */
public class A267078 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A267078() {
    super(0, new long[] {-5, 54, 794, 1562, -6048, -5676, 2287, 286, -22},
      new long[] {1, -13, -104, 260, 260, -104, -13, 1});
  }
}
