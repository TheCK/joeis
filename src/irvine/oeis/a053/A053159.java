package irvine.oeis.a053;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053159 Numbers n such that n+cototient(n) is a power of 2.
 * @author Sean A. Irvine
 */
public class A053159 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long t = 2 * ++mN - LongUtils.phi(mN);
      if ((t & (t - 1)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
