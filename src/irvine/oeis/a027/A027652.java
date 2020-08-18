package irvine.oeis.a027;

import java.util.Collections;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004009;
import irvine.oeis.a134.A134414;

/**
 * A027652 Values of Zagier's function <code>J_1</code>.
 * @author Sean A. Irvine
 */
public class A027652 extends A134414 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Sequence mE4 = new A004009();
  private final Polynomial<Z> mE4x4 = RING.create(Collections.emptyList());
  private final Polynomial<Z> mA = RING.create(Collections.emptyList());

  @Override
  public Z next() {
    mA.add(super.next());
    mE4x4.add((mN & 3) == 0 ? mE4.next() : Z.ZERO);
    return RING.multiply(mA, mE4x4, mN).coeff(mN).negate();
  }
}
