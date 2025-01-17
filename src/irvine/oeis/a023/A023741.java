package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023741 Ternary expansion uses each positive digit just once.
 * @author Sean A. Irvine
 */
public class A023741 implements Sequence {

  private long mN = 0;

  private boolean is(long n) {
    int c = 0;
    while (n != 0) {
      final long r = n % 3;
      if (r > 0) {
        final int bit = 1 << (r - 1);
        if ((c & bit) != 0) {
          return false;
        }
        c |= bit;
      }
      n /= 3;
    }
    return c == 3;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

