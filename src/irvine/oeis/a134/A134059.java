package irvine.oeis.a134;
// Generated by gen_seq4.pl trigf 1, 2, 2, 0, 0, 0 1, -1, -1, 0, 0, 0 at 2020-02-18 21:32
// gf=1/(1-(3*x+3*x*y)/(1-(-2*x-2*x*y)))
// dhdop=[3, -2(, 0)*] DELTA [3, -2(, 0)*]
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A134059 T(n,k) = 3*binomial(n,k), if k &gt; 0, (0 &lt;= k &lt;= n), left column = (1,3,3,3,...).
 * @author Georg Fischer
 */
public class A134059 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A134059() {
    super(0, new long[] {1, 2, 2, 0, 0, 0}, new long[] {1, -1, -1, 0, 0, 0});
  }
}
