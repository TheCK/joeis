package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054903 Composite numbers n such that sigma(n)+6 = sigma(n+6), where sigma=A000203.
 * @author Sean A. Irvine
 */
public class A054903 implements Sequence {

  private long mN = 64;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).sigma().add(6).equals(Cheetah.factor(mN + 6).sigma())) {
        final Z n = Z.valueOf(mN);
        if (!n.isProbablePrime()) {
          return n;
        }
      }
    }
  }
}
