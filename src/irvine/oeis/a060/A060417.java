package irvine.oeis.a060;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A060417 Number of different decimal digits in n-th prime.
 * @author Georg Fischer
 */
public class A060417 extends A000040 {
  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    int count = 0;
    final int[] dc = ZUtils.digitCounts(nextPrime, 10);
    int k = 9;
    while (k >= 0) {
      if (dc[k] > 0) {
        ++count;
      }
      --k;
    }

    return Z.valueOf(count);
  }
}
