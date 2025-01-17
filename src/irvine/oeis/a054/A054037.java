package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A054037 Numbers n such that n^2 contains exactly 9 different digits.
 * @author Sean A. Irvine
 */
public class A054037 implements Sequence {

  private Z mN = Z.valueOf(10123);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Integer.bitCount(ZUtils.syn(mN.square())) == 9) {
        return mN;
      }
    }
  }
}

