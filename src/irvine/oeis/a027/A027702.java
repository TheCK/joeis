package irvine.oeis.a027;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027702 Numbers n such that n-th prime has even number of 1's in binary expansion and (n+1)st prime also has even number of 1's.
 * @author Sean A. Irvine
 */
public class A027702 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      if ((mP.bitCount() & 1) == 0 && (mPrime.nextPrime(mP).bitCount() & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
