package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029489 Numbers k that divide the (left) concatenation of all numbers &lt;= k written in base 20 (most significant digit on left).
 * @author Sean A. Irvine
 */
public class A029489 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      while (mT.compareTo(mA) <= 0) {
        mT = mT.multiply(20);
      }
      mN = mN.add(1);
      mA = mN.multiply(mT).add(mA);
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
