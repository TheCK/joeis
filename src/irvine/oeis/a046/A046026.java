package irvine.oeis.a046;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046026 Smallest prime p dividing n#-1, n#, or n#+1, n squarefree.
 * @author Sean A. Irvine
 */
public class A046026 implements Sequence {

  // Smallest prime p such that n divides one of p#-1, p#, p#+1

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.isSquareFree(++mN)) {
        int k = 0;
        long p = 1;
        long pr = 1;
        while (true) {
          ++k;
          p = mPrime.nextPrime(p);
          pr *= p;
          pr %= mN;
          if (pr <= 1 || pr == mN - 1) {
            return Z.valueOf(p);
          }
        }
      }
    }
  }
}
