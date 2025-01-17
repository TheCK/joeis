package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051423 Sum of prime divisors of n is congruent to 2^n (mod n).
 * @author Sean A. Irvine
 */
public class A051423 implements Sequence {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).sopfr().mod(mN) == LongUtils.modPow(2, mN, mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
