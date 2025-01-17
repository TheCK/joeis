package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046999 Numbers k whose average divisor is nonintegral and divides k.
 * @author Sean A. Irvine
 */
public class A046999 implements Sequence {

  private long mN = 27;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z sigma0 = fs.sigma0();
      final Z sigma1 = fs.sigma();
      if (!sigma1.mod(sigma0).isZero() && sigma0.multiply(mN).mod(sigma1).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
