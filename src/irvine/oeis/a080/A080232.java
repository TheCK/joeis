package irvine.oeis.a080;
// Generated by gen_seq4.pl trigf 1, 0, -2, 0, 0, 0 1, -1, -1, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A080232 Triangle T(n,k) of differences of pairs of consecutive terms of triangle A071919.
 * @author Georg Fischer
 */
public class A080232 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A080232() {
    super(0, new long[] {1, 0, -2, 0, 0, 0}, new long[] {1, -1, -1, 0, 0, 0});
  }
}
