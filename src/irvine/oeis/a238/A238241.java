package irvine.oeis.a238;
// Generated by gen_seq4.pl trigf 1 1, -2, -1, -1, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A238241 Riordan array (1/(1-x-x^2)^2, x/(1-x-x^2)^2).
 * @author Georg Fischer
 */
public class A238241 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A238241() {
    super(0, new long[] {1}, new long[] {1, -2, -1, -1, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 0});
  }
}
