package irvine.oeis.a106;
// Generated by gen_seq4.pl trigf 1, 0, 0, 0, -1, 0, 0, 0, 0, 0 1, -1, -1, 0, -2, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A106597 Triangle T(n,k) (n&gt;=0, 0&lt;=k&lt;=n) read by rows: T(n,0)=T(n,n)=1, T(n,k) = T(n-1,k-1) + T(n-1,k) + Sum_{i &gt;= 1} T(n-2i,k-i).
 * @author Georg Fischer
 */
public class A106597 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A106597() {
    super(0, new long[] {1, 0, 0, 0, -1, 0, 0, 0, 0, 0}, new long[] {1, -1, -1, 0, -2, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
