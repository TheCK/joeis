package irvine.oeis.a182;
// Generated by gen_seq4.pl trigf 1, 0, -1, 0, 0, 0 1, -1, -2, -2, -3, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A182412 Triangle T(n,k), read by rows, given by (1, 2, -2, 0, 0, 0, 0, 0, 0, 0, ...) DELTA (1, 2, -1, 0, 0, 0, 0, 0, 0, 0, ...) where DELTA is the operator defined in A084938.
 * @author Georg Fischer
 */
public class A182412 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A182412() {
    super(0, new long[] {1, 0, -1, 0, 0, 0}, new long[] {1, -1, -2, -2, -3, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
