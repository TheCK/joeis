package irvine.oeis.a048;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048098 Numbers k that are sqrt(k)-smooth: if p | k then p^2 &lt;= k when p is prime.
 * @author Sean A. Irvine
 */
public class A048098 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1) {
        return Z.ONE;
      }
      final Z[] p = Cheetah.factor(mN).toZArray();
      if (p[p.length - 1].longValueExact() <= LongUtils.sqrt(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
