package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015796 Numbers n such that <code>phi(n) + 5 | sigma(n)</code>.
 * @author Sean A. Irvine
 */
public class A015796 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Z.ZERO.equals(fs.sigma().mod(fs.phi().add(5)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
