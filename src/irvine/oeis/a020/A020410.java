package irvine.oeis.a020;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020410 Numbers k such that the continued fraction for sqrt(k) has period 71.
 * @author Sean A. Irvine
 */
public class A020410 implements Sequence {

  private Z mN = Z.valueOf(3732);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (conv.size() == 72) {
          return mN;
        }
      }
    }
  }
}
