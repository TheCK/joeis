package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054984 Composite numbers x such that sigma(x + 6!) = sigma(x + 720) = sigma(x) + 720.
 * @author Sean A. Irvine
 */
public class A054984 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 426;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN) && Cheetah.factor(mN).sigma().add(720).equals(Cheetah.factor(mN + 720).sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}
