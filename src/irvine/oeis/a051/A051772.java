package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051772 Distended numbers.
 * @author Sean A. Irvine
 */
public class A051772 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    outer:
    while (true) {
      Z sum = Z.ZERO;
      for (final Z d : Cheetah.factor(++mN).divisorsSorted()) {
        if (sum.compareTo(d) >= 0) {
          continue outer;
        }
        sum = sum.add(d);
      }
      return Z.valueOf(mN);
    }
  }
}
