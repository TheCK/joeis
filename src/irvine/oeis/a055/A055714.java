package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055714 Numbers n such that n | sigma_10(n).
 * @author Sean A. Irvine
 */
public class A055714 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).sigma(10).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
