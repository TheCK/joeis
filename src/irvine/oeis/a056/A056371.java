package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.math.IntegerUtils;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056371 Number of step shifted (decimated) sequences using a maximum of two different symbols.
 * @author Sean A. Irvine
 */
public class A056371 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      if (IntegerUtils.gcd(k, mN) == 1) {
        int s = 0;
        for (final Z dd : Cheetah.factor(mN).divisors()) {
          s += Euler.phi(dd).divide(new IntegersModMul(dd).order(Z.valueOf(k))).intValueExact();
        }
        sum = sum.add(Z.ONE.shiftLeft(s));
      }
    }
    return sum.divide(Euler.phi(Z.valueOf(mN)));
  }
}
