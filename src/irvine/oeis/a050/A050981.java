package irvine.oeis.a050;

import irvine.math.LongUtils;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050981 Haupt-exponents of 9 modulo integers relatively prime to 9.
 * @author Sean A. Irvine
 */
public class A050981 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (LongUtils.gcd(++mN, 9) > 1) {
      // do nothing
    }
    return new IntegersModMul(mN).order(Z.NINE);
  }
}
