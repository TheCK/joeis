package irvine.oeis.a123;
// Generated by gen_seq4.pl trigf 1 1, -1, -1, -1, 1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A123603 Triangle T(n,k), 0&lt;=k&lt;=n, read by rows, with T(0,0) = 1, T(n,k) = 0 if k&lt;0 or if k&gt;n, T(n,k) = T(n-1,k-1) + T(n-1,k) + T(n-2,k-2) - T(n-2,k-1) + T(n-2,k).
 * @author Georg Fischer
 */
public class A123603 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A123603() {
    super(0, new long[] {1}, new long[] {1, -1, -1, -1, 1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
