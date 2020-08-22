package irvine.oeis.a054;
// Generated by gen_seq4.pl trigf 1, 0, -1, 0, 0, 0 1, -1, -2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A054142 Triangular array C(2*n-k, k), k=0..n, n &gt;= 0.
 * @author Georg Fischer
 */
public class A054142 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A054142() {
    super(0, new long[] {1, 0, -1, 0, 0, 0}, new long[] {1, -1, -2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
