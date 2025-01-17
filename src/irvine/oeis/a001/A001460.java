package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001460 a(n) = (5*n)!/((2*n)!*(n!)^3).
 * @author Sean A. Irvine
 */
public class A001460 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      final long t = mN * 5;
      mA = mA.multiply(5).multiply(t - 4).multiply(t - 3).multiply(t - 2).multiply(t - 1)
        .divide2().divide(mN).divide(mN).divide(mN).divide(2 * mN - 1);
    }
    return mA;
  }
}
