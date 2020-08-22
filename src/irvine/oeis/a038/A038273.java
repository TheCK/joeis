package irvine.oeis.a038;
// Generated by gen_seq4.pl trigf 1 1, -7, -7 at 2020-04-01 15:31
// 
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A038273 Triangle whose (i,j)-th entry is binomial(i,j)*7^(i-j)*7^j.
 * @author Georg Fischer
 */
public class A038273 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A038273() {
    super(0, new long[] {1}, new long[] {1, -7, -7});
  }
}
