package irvine.oeis.a032;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032117 Shifts left under "BIJ" (reversible, indistinct, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032117 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.create(Collections.emptyList());
  private Z mF = Z.ONE;
  private int mN = 0;
  {
    mA.add(Q.ZERO);
  }

  @Override
  public Z next() {
    final Z f = mF;
    mF = mF.multiply(++mN);
    if (mN < 3) {
      mA.add(new Q(Z.TWO, mF));
      return Z.TWO;
    }
    final Q c = A032113.bij(mA, mN).coeff(mN - 1);
    mA.add(c.divide(mN));
    return c.multiply(f).toZ();
  }
}
