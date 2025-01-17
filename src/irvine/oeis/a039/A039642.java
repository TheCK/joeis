package irvine.oeis.a039;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039642 Number of steps to fixed point of "k -&gt; k/2 or (k-1)/2 until result is prime", starting with prime(n)-1.
 * @author Sean A. Irvine
 */
public class A039642 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 0;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long m = mP - 1;
    long c = 1;
    while (m > 3 && !mPrime.isPrime(m)) {
      ++c;
      m >>>= 1;
    }
    return Z.valueOf(c);
  }
}
