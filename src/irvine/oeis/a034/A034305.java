package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034305 Zeroless nonprimes that remain nonprime if any digit is deleted.
 * @author Sean A. Irvine
 */
public class A034305 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 13;

  private boolean isDelNonPrime(final String s) {
    for (int k = 0; k < s.length(); ++k) {
      if (mPrime.isPrime(Long.parseLong(s.substring(0, k) + s.substring(k + 1)))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        final String s = String.valueOf(mN);
        if (!s.contains("0") && isDelNonPrime(s)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
