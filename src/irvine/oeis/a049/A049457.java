package irvine.oeis.a049;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049457 Least positive integer k such that the number having periodic continued fraction [ 1,m,1,m,1,m,... ] is of form (a+b*sqrt(k))/c, where a,b,c are positive integers.
 * @author Sean A. Irvine
 */
public class A049457 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(Z.valueOf(++mN).square().add(4 * mN));
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      if ((fs.getExponent(p) & 1) == 1) {
        prod = prod.multiply(p);
      }
    }
    return prod;
  }
}
