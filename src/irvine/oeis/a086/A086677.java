package irvine.oeis.a086;
// manually egfu at 2021-12-05 20:35

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A086677 Number of Steiner topologies on n points.
 * E.g.f.: 4*(x-3)/(x+1)^4 - (-13+22*x+3*x^2)/((-x^2-4*x+1)^(1/2)*(x+1)^4)
 * @author Georg Fischer
 */
public class A086677 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A086677() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.subtract(RING.series(RING.multiply(RING.monomial(Q.FOUR, 0), RING.subtract(RING.x(), RING.monomial(Q.THREE, 0)), n), RING.pow(RING.add(RING.x(), RING.one()), 4, n), n), RING.series(RING.add(RING.add(RING.negate(RING.monomial(new Q(13), 0)), RING.monomial(new Q(22), 1)), RING.monomial(Q.THREE, 2)), RING.multiply(RING.exp(RING.multiply(RING.log(RING.add(RING.subtract(RING.negate(RING.pow(RING.x(), 2, n)), RING.monomial(Q.FOUR, 1)), RING.one()), n), RING.series(RING.one(), RING.monomial(Q.TWO, 0), n), n), n), RING.pow(RING.add(RING.x(), RING.one()), 4, n), n), n));
  }
}
