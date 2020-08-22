package irvine.oeis.a207;
// Generated by gen_seq4.pl trigf 1 1, 3, -1, 1, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A207815 Triangle of coefficients of Chebyshev's S(n,x-3) polynomials (exponents of x in increasing order).
 * @author Georg Fischer
 */
public class A207815 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A207815() {
    super(0, new long[] {1}, new long[] {1, 3, -1, 1, 0, 0});
  }
}
