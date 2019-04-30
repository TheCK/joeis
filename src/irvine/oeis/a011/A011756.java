package irvine.oeis.a011;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A011756 <code>a(n) = prime(n(n+1)/2)</code>.
 * @author Sean A. Irvine
 */
public class A011756 extends A000217 {

  {
    super.next();
  }

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z t = super.next();
    while (!mN.equals(t)) {
      mP = mPrime.nextPrime(mP);
      mN = mN.add(1);
    }
    return mP;
  }
}
