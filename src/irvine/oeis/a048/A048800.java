package irvine.oeis.a048;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048800 E.g.f. satisfies A(x) = 1 + x * A(x / (1 - x)).
 * @author Sean A. Irvine
 */
public class A048800 implements Sequence {

  private Z mF = Z.ONE;
  private int mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ONE;
    }
    if (mN > 0) {
      mF = mF.multiply(mN + 1);
    }
    return BellNumbers.bell(mN).multiply(mF);
  }
}
