package irvine.oeis.a146;
// Generated by gen_seq4.pl trigf 1, -4, -4, 4, 13, 4, 0, -10, -10, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 1, -5, -5, 8, 20, 8, -4, -24, -24, -4, 0, 8, 16, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A146769 Coefficients of polynomial P(n) by rows, with P(n) = (x+1)^n + 2^(n-3)*((x+1)^n - x^n - 1) for n &gt; 0 and P(0) = 1.
 * @author Georg Fischer
 */
public class A146769 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A146769() {
    super(0, new long[] {1, -4, -4, 4, 13, 4, 0, -10, -10, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, -5, -5, 8, 20, 8, -4, -24, -24, -4, 0, 8, 16, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
