package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051154 a(n) = 1 + 2^k + 4^k where k = 3^n.
 * @author Sean A. Irvine
 */
public class A051154 implements Sequence {

  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(3);
    return Z.ONE.shiftLeft(mT.multiply2().intValueExact()).add(Z.ONE.shiftLeft(mT.intValue())).add(1);
  }
}
