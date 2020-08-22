package irvine.oeis.a147;
// Generated by gen_seq4.pl trigf 1, -3, 0 1, -3, -1, 0, 1, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A147720 Riordan array (1, x(1-x)/(1-3x)).
 * @author Georg Fischer
 */
public class A147720 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A147720() {
    super(0, new long[] {1, -3, 0}, new long[] {1, -3, -1, 0, 1, 0, 0, 0, 0, 0});
  }
}
