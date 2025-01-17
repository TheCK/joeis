package irvine.oeis.a244;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A244037 Numbers of the form x^2+14y^2.
 * @author Sean A. Irvine
 */
public class A244037 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long s = 0; s * s <= mN; ++s) {
        final long t = mN - s * s;
        if (t % 14 == 0) {
          final long u = t / 14;
          final long v = LongUtils.sqrt(u);
          if (v * v == u) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
