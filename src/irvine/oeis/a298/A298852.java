package irvine.oeis.a298;
// Generated by gen_seq4.pl decexro at 2021-07-25 17:05

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A298852 Decimal expansion of the greatest real zero of x^4 - 4*x^2 - x + 3.
 * Polynomial: x^4-4*x^2-x+3
 * @author Georg Fischer
 */
public class A298852 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A298852() {
    super(Polynomial.create(3, -1, -4, 0, 1), CR.ONE, CR.TWO);
  }
}
