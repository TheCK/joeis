package irvine.oeis.a020;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020426 Numbers k such that the continued fraction for sqrt(k) has period 87.
 * @author Sean A. Irvine
 */
public class A020426 implements Sequence {

  private Z mN = Z.valueOf(3048);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (conv.size() == 88) {
          return mN;
        }
      }
    }
  }
}
