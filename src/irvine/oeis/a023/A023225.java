package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023225 Numbers n such that n and 7n + 6 are both prime.
 * @author Sean A. Irvine
 */
public class A023225 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(7).add(6))) {
        return p;
      }
    }
  }
}
