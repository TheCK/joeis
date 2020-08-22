package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A030091 Primes such that p and p^2 have same set of digits.
 * @author Sean A. Irvine
 */
public class A030091 extends A000040 {

  static boolean isOk(final Z a, final Z b) {
    final int[] synA = ZUtils.digitCounts(a);
    final int[] synB = ZUtils.digitCounts(b);
    for (int k = 0; k < synA.length; ++k) {
      if (synA[k] > 0 ^ synB[k] > 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (isOk(p, p.square())) {
        return p;
      }
    }
  }
}
