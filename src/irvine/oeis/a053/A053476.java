package irvine.oeis.a053;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053476 Smallest number m such that when A051953 is applied n times to m the result is neither a power of 2 nor 0.
 * @author Sean A. Irvine
 */
public class A053476 implements Sequence {

  private long mN = 1;
  private long mM = 3;

  private long count(long n) {
    if ((n & (n - 1)) == 0) {
      return 0;
    }
    long cnt = 0;
    while (true) {
      n -= LongUtils.phi(n);
      ++cnt;
      if ((n & (n - 1)) == 0) {
        return cnt;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    while (count(mM) < mN) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}

