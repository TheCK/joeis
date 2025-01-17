package irvine.oeis.a097;
// Generated by gen_seq4.pl trigf 1, -1, 0 1, -1, -1, 0, 0, 0 at 2020-02-18 21:32
// gf=1/(1-(+1*x*y)/(1-(1*x)))
// dhdop=[0, 1(, 0)*] DELTA [1(, 0)*]
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A097805 Compositions of n with k parts, T(n, k) = binomial(n-1, k-1) for n, k &gt;= 1 and T(n, 0) = 0^n, triangle read by rows for n &gt;= 0 and 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A097805 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A097805() {
    super(0, new long[] {1, -1, 0}, new long[] {1, -1, -1, 0, 0, 0});
  }
}
