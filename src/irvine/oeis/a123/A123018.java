package irvine.oeis.a123;
// Generated by gen_seq4.pl trigf 1 1, -1, 2, 0, -2, 2, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A123018 Triangle read by rows: row n gives the coefficients of x^k (0 &lt;= k &lt;= n) in the expansion of Sum_{j=0..n} A320508(n,j)*x^j*(1 - x)^(n - j).
 * @author Georg Fischer
 */
public class A123018 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A123018() {
    super(0, new long[] {1}, new long[] {1, -1, 2, 0, -2, 2, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
