package irvine.oeis.a054;
// Generated by gen_seq4.pl trigf 1 1, -1, -1, 0, 1, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A054106 Alternating sums of vertically aligned numbers in Pascal's triangle: T(n,k) = C(n,k) - C(n-2,k-1) + C(n-4,k-2) - ... +- C(n-2[n/2],m).
 * @author Georg Fischer
 */
public class A054106 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A054106() {
    super(0, new long[] {1}, new long[] {1, -1, -1, 0, 1, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
