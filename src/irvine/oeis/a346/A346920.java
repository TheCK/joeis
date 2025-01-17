package irvine.oeis.a346;
// Generated by gen_seq4.pl egfu at 2021-12-06 15:00

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A346920 E.g.f.: 1 / (1 - (exp(x) - 1)^5 / 5!).
 * E.g.f.: 1 / (1 - (exp(x) - 1)^5 / 120)
 * @author Georg Fischer
 */
public class A346920 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A346920() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.one(), RING.subtract(RING.one(), RING.series(RING.pow(RING.subtract(RING.exp(RING.x(), n), RING.one()), 5, n), RING.monomial(new Q(120), 0), n)), n);
  }
}
