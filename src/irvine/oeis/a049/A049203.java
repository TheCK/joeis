package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000720;

/**
 * A049203 Primes for which A049076(p) &gt;= 5.
 * @author Sean A. Irvine
 */
public class A049203 extends A000040 {

  private final MemorySequence mPi = MemorySequence.cachedSequence(new A000720());

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      final Z pp = super.next();
      int p = pp.intValueExact();
      do {
        ++cnt;
        p = mPi.a(p - 1).intValueExact();
      } while (mPrime.isPrime(p) && cnt < 5);
      if (cnt >= 5) {
        return pp;
      }
    }
  }
}
