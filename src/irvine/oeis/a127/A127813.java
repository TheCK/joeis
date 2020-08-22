package irvine.oeis.a127;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A127813 G.f.: (x^2+6*x^3+7*x^4+8*x^5+4*x^6-3*x^8-2*x^9-x^10) / ((1-x)^2*(1-x^2)^3*(1-x^3)^4*(1-x^4)).
 * @author Georg Fischer
 */
public class A127813 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A127813() {
    super(0, new long[] {0, 0, 1, 6, 7, 8, 4, 0, -3, -2, -1},
      new long[] {1, -2, -2, 2, 7, 4, -14, -12, 3, 22, 16, -14, -22, -14, 16, 
      22, 3, -12, -14, 4, 7, 2, -2, -2, 1});
  }
}
