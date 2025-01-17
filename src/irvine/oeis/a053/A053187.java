package irvine.oeis.a053;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053187 Square nearest to n.
 * @author Sean A. Irvine
 */
public class A053187 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final long s = LongUtils.sqrt(++mN);
    final long s2 = s * s;
    final long t2 = (s + 1) * (s + 1);
    return Z.valueOf(Math.abs(s2 - mN) < Math.abs(mN - t2) ? s2 : t2);
  }
}

