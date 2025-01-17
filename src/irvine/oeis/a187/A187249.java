package irvine.oeis.a187;
// Generated by gen_seq4.pl egfu at 2021-12-07 21:31

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A187249 Number of cycles with at most 2 alternating runs in all permutations of [n] (it is assumed that the smallest element of the cycle is in the first position).
 * E.g.f.: (1/4)(exp(2*x) - 1 +2*x)/(1-x)
 * @author Georg Fischer
 */
public class A187249 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A187249() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.multiply(RING.series(RING.one(), RING.monomial(Q.FOUR, 0), n), RING.add(RING.subtract(RING.exp(RING.monomial(Q.TWO, 1), n), RING.one()), RING.monomial(Q.TWO, 1)), n), RING.oneMinusXToTheN(1), n);
  }
}
