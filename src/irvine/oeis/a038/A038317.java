package irvine.oeis.a038;
// Generated by gen_seq4.pl trigf 1 1, -11, -3 at 2020-04-01 15:31
// 
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A038317 Triangle whose (i,j)-th entry is binomial(i,j)*11^(i-j)*3^j.
 * @author Georg Fischer
 */
public class A038317 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A038317() {
    super(0, new long[] {1}, new long[] {1, -11, -3});
  }
}
