package irvine.oeis.a108;
// Generated by gen_seq4.pl egfsi at 2021-12-01 15:37

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A108125 Expansion of e.g.f.: x/(1 - log(1+x)).
 * E.g.f.: x/(1 - log(1+x))
 * @author Georg Fischer
 */
public class A108125 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.series(RING.x(), RING.subtract(RING.one(), RING.log(RING.onePlusXToTheN(1), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
