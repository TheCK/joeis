package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034737 Dirichlet convolution of b_n=2^(n-1) with sigma(n).
 * @author Sean A. Irvine
 */
public class A034737 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Cheetah.factor(mN / d).sigma().shiftLeft(d - 1));
    }
    return sum;
  }
}
