package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002340 Numbers x such that p = x^2 - 5y^2, where p = 0, 1, or 4 (mod 5).
 * @author Sean A. Irvine
 */
public class A002340 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Z.FIVE.equals(mP)) {
        return Z.FIVE;
      }
      final long r = mP.mod(5);
      if (r == 1 || r == 4) {
        Z y = Z.ZERO;
        while (true) {
          y = y.add(1);
          final Z x2 = mP.add(y.square().multiply(5));
          final Z[] s = x2.sqrtAndRemainder();
          if (s[1].isZero()) {
            return s[0];
          }
        }
      }
    }
  }
}
