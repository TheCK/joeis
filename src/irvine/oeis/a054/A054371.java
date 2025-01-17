package irvine.oeis.a054;

import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054371 Number of unlabeled 7-gonal cacti having n polygons.
 * @author Sean A. Irvine
 */
public class A054371 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z a = Integers.SINGLETON.sumdiv(mN, d -> Binomial.binomial(7L * d, d).multiply(LongUtils.phi(mN / d)));
    final Z b = Integers.SINGLETON.sumdiv(IntegerUtils.gcd(mN - 1, 7), d -> Binomial.binomial(7L * mN / d, (mN - 1) / d).multiply(LongUtils.phi(d)));
    return a.add(b).divide(7L * mN).subtract(Binomial.binomial(7L * mN, mN).divide(6L * mN + 1));
  }
}
