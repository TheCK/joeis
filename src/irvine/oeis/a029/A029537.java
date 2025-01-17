package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A029537 Numbers n such that n divides the (left) concatenation of all numbers &lt;= n written in base 20 (most significant digit on right).
 * @author Sean A. Irvine
 */
public class A029537 implements Sequence {

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
      mA = ZUtils.reverse(mN, 20).multiply(mT).add(mA);
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
