package irvine.oeis.a038;
// Generated by gen_seq4.pl trigf 1 1, -5, -3, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A038245 Triangle whose (i,j)-th entry is binomial(i,j)*5^(i-j)*3^j.
 * @author Georg Fischer
 */
public class A038245 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A038245() {
    super(0, new long[] {1}, new long[] {1, -5, -3, 0, 0, 0});
  }
}
