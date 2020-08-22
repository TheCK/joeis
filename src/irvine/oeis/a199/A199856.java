package irvine.oeis.a199;
// Generated by gen_seq4.pl trigf 1, -3, 0, 0, 1, 0, 0, 0, 0, 0 1, -2, -1, 0, 1, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A199856 Triangle T(n,k), read by rows, given by (-1,3,0,0,0,0,0,0,0,0,0,...) DELTA (1,0,-1/3,1/3,0,0,0,0,0,0,0,...) where DELTA is the operator defined in A084938.
 * @author Georg Fischer
 */
public class A199856 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A199856() {
    super(0, new long[] {1, -3, 0, 0, 1, 0, 0, 0, 0, 0}, new long[] {1, -2, -1, 0, 1, 0, 0, 0, 0, 0});
  }
}
