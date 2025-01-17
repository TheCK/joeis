package irvine.oeis.a190;
// Generated by gen_seq4.pl trigf at 2021-02-20 21:59
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;


/**
 * A190215 Riordan matrix ((1-x-x^2)/(1-2x-x^2),(x-x^2-x^3)/(1-2x-x^2).
 *
 * @author Georg Fischer
 */
public class A190215 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A190215() {
    super(0, new long[] {1, -3, 0, 0, 0, 0, 3, 0, 0, 0, 1, 0, 0, 0, 0}, new long[] {1, -4, -1, 2, 3, 0, 4, 0, 0, 0, 1, -3, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
