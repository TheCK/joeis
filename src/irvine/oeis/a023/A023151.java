package irvine.oeis.a023;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023151 Numbers n such that prime(n) == 9 (mod n).
 * @author Sean A. Irvine
 */
public class A023151 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP % ++mN == 9 % mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
