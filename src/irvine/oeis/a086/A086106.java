package irvine.oeis.a086;
// Generated by gen_seq4.pl decexro at 2021-07-25 17:05

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A086106 Decimal expansion of positive root of x^4 - x^3 - 1 = 0.
 * Polynomial: x^4-x^3-1
 * @author Georg Fischer
 */
public class A086106 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A086106() {
    super(Polynomial.create(-1, 0, 0, -1, 1), CR.ONE, CR.TWO);
  }
}
