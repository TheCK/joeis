package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013199 Expansion of e.g.f. log(sec(x) + tanh(x)).
 * @author Sean A. Irvine
 */
public class A013199 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.log(RING.add(RING.sec(RING.x(), mN), RING.tanh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
