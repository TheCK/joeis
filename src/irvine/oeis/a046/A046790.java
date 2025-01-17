package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046790 Positive numbers divisible by 8 or by the square of an odd prime.
 * @author Sean A. Irvine
 */
public class A046790 implements Sequence {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      if ((++mN & 7) == 0) {
        return Z.valueOf(mN);
      }
      long m = mN;
      while ((m & 1) == 0) {
        m >>>= 1;
      }
      if (Cheetah.factor(m).maxExponent() > 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
