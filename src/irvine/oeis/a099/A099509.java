package irvine.oeis.a099;
// Generated by gen_seq4.pl trigf 1, -1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0 1, -2, 0, 1, 0, -2, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A099509 Triangle, read by rows, of trinomial coefficients arranged so that there are n+1 terms in row n by setting T(n,k) equal to the coefficient of z^k in (1 + z + z^2)^(n-[k/2]), for n&gt;=k&gt;=0, where [k/2] is the integer floor of k/2.
 * @author Georg Fischer
 */
public class A099509 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A099509() {
    super(0, new long[] {1, -1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, -2, 0, 1, 0, -2, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
