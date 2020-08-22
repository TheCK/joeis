package irvine.oeis.a020;

import java.util.List;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020381 Numbers n such that continued fraction for sqrt(n) has period 42.
 * @author Sean A. Irvine
 */
public class A020381 implements Sequence {

  private Z mN = Z.valueOf(570);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        final List<Z> conv = Convergents.continuedFractionConvergentsSqrt(mN.longValueExact());
        if (conv.size() == 43) {
          return mN;
        }
      }
    }
  }
}
