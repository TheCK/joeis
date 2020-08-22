package irvine.oeis.a109;
// Generated by gen_seq4.pl trigf 1, -2, 0, 1, 0, 0 1, -3, -1, 3, 0, 0, -1, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A109955 Number triangle binomial(n+2k,3k).
 * @author Georg Fischer
 */
public class A109955 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A109955() {
    super(0, new long[] {1, -2, 0, 1, 0, 0}, new long[] {1, -3, -1, 3, 0, 0, -1, 0, 0, 0});
  }
}
