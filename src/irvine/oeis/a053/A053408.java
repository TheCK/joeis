package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a003.A003266;

/**
 * A053408 Numbers n such that A003266(n) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A053408 extends A003266 {

  private long mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
