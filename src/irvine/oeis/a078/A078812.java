package irvine.oeis.a078;
// Generated by gen_seq4.pl trigf 1 1,-2,-1, 1, 0, 0 at 2020-10-28 10:23
// 
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;


/**
 * A078812 Triangle read by rows: T(n, k) = binomial(n+k-1, 2*k-1).
 * @author Georg Fischer
 */
public class A078812 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A078812() {
    super(0, new long[]{1}, new long[]{1, -2, -1, 1, 0, 0});
  }
}
