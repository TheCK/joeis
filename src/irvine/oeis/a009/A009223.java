package irvine.oeis.a009;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009223 <code>a(n) = gcd(sigma(n), phi(n))</code>.
 * @author Sean A. Irvine
 */
public class A009223 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final FactorSequence fs = Cheetah.factor(mN);
    return fs.sigma().gcd(fs.phi());
  }
}
