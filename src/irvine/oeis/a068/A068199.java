package irvine.oeis.a068;
// manually egfu at 2021-12-03 19:31

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;
import irvine.oeis.PrependSequence;

/**
 * A068199 One of a family of sequences that interpolates between the Bell numbers and the factorials.
 * E.g.f.: 1 + 2*exp(3*exp(x)-3)
 * @author Georg Fischer
 */
public class A068199 extends PrependSequence {

  /** Construct the sequence. */
  public A068199() {
    super(new ExponentialGeneratingFunction(0) {
            @Override
            public Polynomial<Q> compute(final int n) {
              return RING.multiply(RING.monomial(Q.TWO, 0), RING.exp(RING.subtract(RING.multiply(RING.monomial(Q.THREE, 0),
                RING.exp(RING.x(), n), n), RING.monomial(Q.THREE, 0)), n), n);
            }
          }
      , 1);
  }
}
