package irvine.oeis.a322;
// Generated by gen_seq4.pl decexro at 2021-07-25 17:05

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A322632 Decimal expansion of the real solution to 23*x^5 - 41*x^4 + 10*x^3 - 6*x^2 - x - 1 = 0. Constant occurring in the asymptotic behavior of the number of lattice paths of slope 2/5, observed by D. Knuth.
 * Polynomial: 23*x^5-41*x^4+10*x^3-6*x^2-x-1
 * @author Georg Fischer
 */
public class A322632 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A322632() {
    super(Polynomial.create(-1, -1, -6, 10, -41, 23), CR.ONE, CR.TWO);
  }
}
