package irvine.oeis.a147;
// Generated by gen_seq4.pl trigf 1, -7, 0, 3, 0, 0 1, -8, -1, 7, 4, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A147724 a(n) = C(3,n) DELTA C(0,n).
 * @author Georg Fischer
 */
public class A147724 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A147724() {
    super(0, new long[] {1, -7, 0, 3, 0, 0}, new long[] {1, -8, -1, 7, 4, 0, 0, 0, 0, 0});
  }
}
