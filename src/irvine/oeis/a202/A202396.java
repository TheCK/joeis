package irvine.oeis.a202;
// Generated by gen_seq4.pl trigf 1, -1, 1, 0, 0, 0 1, -3, -1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A202396 Triangle T(n,k), read by rows, given by (2, 1/2, 1/2, 0, 0, 0, 0, 0, 0, 0, ...) DELTA (2, -1/2, -1/2, 0, 0, 0, 0, 0, 0, 0, ...) where DELTA is the operator defined in A084938.
 * @author Georg Fischer
 */
public class A202396 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A202396() {
    super(0, new long[] {1, -1, 1, 0, 0, 0}, new long[] {1, -3, -1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
