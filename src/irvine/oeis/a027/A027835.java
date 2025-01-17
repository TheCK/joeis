package irvine.oeis.a027;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;

/**
 * A027835 Number of unlabeled strongly connected n-state 2-input automata.
 * @author Sean A. Irvine
 */
public class A027835 extends A027834 {

  // After Petros Hadjicostas

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final int r = getR();
    for (final Z dd1 : Cheetah.factor(mN).divisors()) {
      final int m = dd1.intValue();
      Z s = Z.ZERO;
      for (final Z dd2 : Cheetah.factor(mN / m).divisors()) {
        final int d2 = dd2.intValue();
        final int mu = Mobius.mobius(mN / (m * (long) d2));
        if (mu != 0) {
          s = s.signedAdd(mu == 1, Z.valueOf(d2).pow((r - 1) * (long) m + 1));
        }
      }
      sum = sum.add(s.multiply(mS.get(r, m)).divide(mF.factorial(m - 1)));
    }
    return sum.divide(mN);
  }
}
