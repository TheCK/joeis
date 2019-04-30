package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020696 Let <code>a,b</code>,c,...k be all divisors of <code>n; a(n) = (a+1)*(b+1)*...*(k+1)</code>.
 * @author Sean A. Irvine
 */
public class A020696 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      prod = prod.multiply(d.add(1));
    }
    return prod;
  }
}
