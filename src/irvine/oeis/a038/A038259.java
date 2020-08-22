package irvine.oeis.a038;
// Generated by gen_seq4.pl trigf 1 1, -6, -5 at 2020-04-01 15:31
// 
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A038259 Triangle whose (i,j)-th entry is binomial(i,j)*6^(i-j)*5^j.
 * @author Georg Fischer
 */
public class A038259 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A038259() {
    super(0, new long[] {1}, new long[] {1, -6, -5});
  }
}
