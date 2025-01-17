package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055377 a(n) = largest prime &lt;= n/2.
 * @author Sean A. Irvine
 */
public class A055377 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    return Z.valueOf(mPrime.prevPrime(++mN / 2 + 1));
  }
}
