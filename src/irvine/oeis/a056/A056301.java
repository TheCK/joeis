package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.a152.A152175;

/**
 * A056301 Number of primitive (period n) n-bead necklace structures using a maximum of five different colored beads.
 * @author Sean A. Irvine
 */
public class A056301 extends A152175 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      final int mu = Mobius.mobius(mN / d);
      if (mu != 0) {
        sum = sum.signedAdd(mu == 1, t(d, 1).add(t(d, 2)).add(t(d, 3)).add(t(d, 4)).add(t(d, 5)));
      }
    }
    return sum;
  }
}
