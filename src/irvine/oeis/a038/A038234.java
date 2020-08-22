package irvine.oeis.a038;
// Generated by gen_seq4.pl trigf 1 1, -4, -4, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A038234 Triangle whose (i,j)-th entry is binomial(i,j)*4^(i-j)*4^j.
 * @author Georg Fischer
 */
public class A038234 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A038234() {
    super(0, new long[] {1}, new long[] {1, -4, -4, 0, 0, 0});
  }
}
