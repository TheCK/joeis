package irvine.oeis.a045;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045634 Number of ways in which n can be partitioned as a sum of a square and cube.
 * @author Sean A. Irvine
 */
public class A045634 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    long s;
    for (long k = 0; (s = mN - k * k * k) >= 0; ++k) {
      final long t = LongUtils.sqrt(s);
      if (t * t == s) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
