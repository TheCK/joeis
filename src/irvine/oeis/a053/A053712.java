package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A053712 Lower balancing primes to prime-balanced factorials.
 * @author Sean A. Irvine
 */
public class A053712 extends A000142 {

  private final Fast mPrime = new Fast();
  {
    super.next(); // skip 0!
    super.next(); // skip 1!
  }

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      final Z p = mPrime.prevPrime(f);
      final Z n = mPrime.nextPrime(f);
      if (p.add(n).divide2().equals(f)) {
        return p;
      }
    }
  }
}
