package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050789 Consider the Diophantine equation x^3 + y^3 = z^3 - 1 (x &lt; y &lt; z) or 'Fermat near misses'. The values of z (see A050787) are arranged in monotonically increasing order. Sequence gives values of y.
 * @author Sean A. Irvine
 */
public class A050789 implements Sequence {

  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).pow(3).subtract(1);
      for (long x = 2; x < t.root(3).longValueExact(); ++x) {
        final Z y3 = t.subtract(Z.valueOf(x).pow(3));
        final Z y = y3.root(3);
        if (y3.auxiliary() == 1) {
          return y;
        }
      }
    }
  }
}

