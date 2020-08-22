package irvine.oeis.a094;
// Generated by gen_seq4.pl trigf 1 1, -3, -3, 3, 6, 3, -1, -3, -3, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A094305 Triangle read by rows: T(n,k) = ((n+1)(n+2)/2) * binomial(n,k) (0 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A094305 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A094305() {
    super(0, new long[] {1}, new long[] {1, -3, -3, 3, 6, 3, -1, -3, -3, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
