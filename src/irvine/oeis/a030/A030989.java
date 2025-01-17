package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A030989 6-automorphic numbers: final digits of 6n^2 agree with n.
 * @author Sean A. Irvine
 */
public class A030989 implements Sequence {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(5);
    return ZUtils.chineseRemainderTheorem(new Z[] {Z.ZERO, Z.SIX.modInverse(mF)}, new Z[] {Z.ONE.shiftLeft(mN), mF});
  }
}
