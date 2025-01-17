package irvine.oeis.a049;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049113 Number of powers of 2 in sequence obtained when phi (A000010) is repeatedly applied to n.
 * @author Sean A. Irvine
 */
public class A049113 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    long cnt = (n & (n - 1)) == 0 ? 1 : 0;
    while (n != 1) {
      n = LongUtils.phi(n);
      if ((n & (n - 1)) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

