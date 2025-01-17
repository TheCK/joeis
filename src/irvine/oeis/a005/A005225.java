package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005225 Number of permutations of length n with equal cycles.
 * @author Sean A. Irvine
 */
public class A005225 implements Sequence {

  private int mN = 0;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(mN).divisors()) {
      final int dd = d.intValueExact();
      sum = sum.add(mF.factorial(mN).divide(mF.factorial(dd)).divide(Z.valueOf(mN / dd).pow(dd)));
    }
    return sum;
  }
}
