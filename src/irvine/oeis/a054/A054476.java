package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A054476 Numbers not divisible by any of their digits when written in base 5.
 * @author Sean A. Irvine
 */
public class A054476 implements Sequence {

  private long mN = 12;

  @Override
  public Z next() {
    outer:
    while (true) {
      final int[] cnts = ZUtils.digitCounts(++mN, 5);
      for (int k = 1; k < cnts.length; ++k) {
        if (cnts[k] > 0 && mN % k == 0) {
          continue outer;
        }
      }
      return Z.valueOf(mN);
    }
  }
}
