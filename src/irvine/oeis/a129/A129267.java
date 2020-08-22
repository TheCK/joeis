package irvine.oeis.a129;
// Generated by gen_seq4.pl trigf 1 1, -1, -1, 1, 1, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A129267 Triangle with T(n,k) = T(n-1,k-1) + T(n-1,k) - T(n-2,k-1) - T(n-2,k) and T(0,0)=1 .
 * @author Georg Fischer
 */
public class A129267 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A129267() {
    super(0, new long[] {1}, new long[] {1, -1, -1, 1, 1, 0, 0, 0, 0, 0});
  }
}
