package irvine.oeis.a296;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A296436 Expansion of e.g.f. log(1 + arcsin(x))*exp(x).
 * E.g.f.: log(1 + arcsin(x))*exp(x)
 * @author Georg Fischer
 */
public class A296436 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.multiply(RING.log(RING.add(RING.one(), RING.asin(RING.x(), mN)), mN), RING.exp(RING.x(), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
