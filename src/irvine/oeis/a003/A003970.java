package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003970 M\u00f6bius transform of A003960 (with alternating zeros omitted).
 * @author Sean A. Irvine
 */
public class A003970 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    final FactorSequence fs = Cheetah.factor(mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.add(1).divide2().pow(fs.getExponent(p) - 1).multiply(p.subtract(1).divide2()));
    }
    return prod;
  }
}
