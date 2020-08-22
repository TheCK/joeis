package irvine.oeis.a020;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020349 Numbers n such that continued fraction for sqrt(n) has period 10.
 * @author Sean A. Irvine
 */
public class A020349 implements Sequence {

  private Z mN = Z.valueOf(42);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (conv.size() == 11) {
          return mN;
        }
      }
    }
  }
}
