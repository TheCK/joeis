package irvine.oeis.a293;
// Generated by gen_seq4.pl decexro at 2021-07-17 00:26

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A293508 Decimal expansion of the positive real root of x^6 - x^5 - x^4 + x^2 - 1.
 * Polynomial: x^6-x^5-x^4+x^2-1
 * @author Georg Fischer
 */
public class A293508 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A293508() {
    super(Polynomial.create(-1, 0, 1, 0, -1, -1, 1), CR.ONE, CR.TWO);
  }
}
