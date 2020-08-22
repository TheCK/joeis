package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053336 a(n) contains n digits (either '5' or '6') and is divisible by 2^n.
 * @author Sean A. Irvine
 */
public class A053336 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;
  private Z mS = null;

  @Override
  public Z next() {
    mS = mS == null ? Z.ONE : mS.multiply(10);
    mT = mT.multiply2();
    final Z a = mS.multiply(5).add(mA);
    if (Z.ZERO.equals(a.mod(mT))) {
      mA = a;
    } else {
      mA = mS.multiply(6).add(mA);
    }
    return mA;
  }
}
