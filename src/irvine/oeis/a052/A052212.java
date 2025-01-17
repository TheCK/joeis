package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052212 Numbers whose square contains the digits of n in order (not necessarily consecutively).
 * @author Sean A. Irvine
 */
public class A052212 implements Sequence {

  private Z mN = Z.ZERO;

  private boolean is(Z s, Z n) {
    while (!n.isZero()) {
      final long d = n.mod(10);
      n = n.divide(10);
      while (s.mod(10) != d) {
        s = s.divide(10);
        if (s.isZero()) {
          return false;
        }
      }
      s = s.divide(10);
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (is(mN.square(), mN)) {
        return mN;
      }
    }
  }
}
