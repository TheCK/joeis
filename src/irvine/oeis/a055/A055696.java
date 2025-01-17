package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055696 Numbers n such that n | Sigma_2(n) + Phi(n)^2.
 * @author Sean A. Irvine
 */
public class A055696 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma(2).add(fs.phi().square()).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
