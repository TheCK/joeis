package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A052489 Largest number that is n times sum of its decimal digits.
 * @author Sean A. Irvine
 */
public class A052489 implements Sequence {

  // After Michel Marcus

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z nbd = Z.ONE;
    while (nbd.multiply(9 * mN).compareTo(Z.TWO.pow(nbd)) > 0) {
      nbd = nbd.add(1);
    }
    for (Z k = nbd.multiply(9 * mN); k.signum() > 0; k = k.subtract(1)) {
      if (Z.valueOf(ZUtils.digitSum(k)).multiply(mN).equals(k)) {
        return k;
      }
    }
    return Z.ZERO;
  }
}

