package irvine.oeis.a215;
// Generated by gen_seq4.pl egfsim/egfsi at 2021-11-29 22:48

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A215347 n-th derivative of cos(x)^x at x=0.
 * E.g.f.: cos(x)^x
 * @author Georg Fischer
 */
public class A215347 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.multiply(RING.log(RING.cos(RING.x(), mN), mN), RING.x(), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
