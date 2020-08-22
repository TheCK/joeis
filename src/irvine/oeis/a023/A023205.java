package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023205 Numbers m such that m and 2*m + 5 are both prime.
 * @author Sean A. Irvine
 */
public class A023205 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply2().add(5))) {
        return p;
      }
    }
  }
}
