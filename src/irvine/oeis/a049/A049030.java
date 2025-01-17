package irvine.oeis.a049;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049030 Sum of sigma(j) for 1&lt;=j&lt;10^n, where sigma(j) = A048050(j) is the sum of the proper divisors &gt;1 of j (excluding 1 and n).
 * @author Sean A. Irvine
 */
public class A049030 implements Sequence {

  private long mN = 1;
  private long mT = 10;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z res = mSum;
      mSum = mSum.add(Cheetah.factor(++mN).sigma().subtract(mN + 1));
      if (mN == mT) {
        mT *= 10;
        return res;
      }
    }
  }
}
