package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A055971 Numbers n such that n | (sigma(n) - d(n) - phi(n)) and n is not a prime or twice a prime.
 * @author Sean A. Irvine
 */
public class A055971 extends A018252 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.isOdd() || !n.divide2().isProbablePrime()) {
        final FactorSequence fs = Cheetah.factor(n);
        if (fs.sigma().subtract(fs.sigma0()).subtract(fs.phi()).mod(n).isZero()) {
          return n;
        }
      }
    }
  }
}
