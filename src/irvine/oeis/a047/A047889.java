package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047889 Number of permutations in S_n with longest increasing subsequence of length &lt;= 4.
 * @author Sean A. Irvine
 */
public class A047889 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private int mN = -3;

  @Override
  public Z next() {
    if (++mN >= 0) {
      final Z t = mA;
      mA = mB;
      mB = mA.multiply(Z.valueOf(20 * mN).add(182).multiply(mN).add(510).multiply(mN).add(428))
        .subtract(t.multiply(Z.valueOf(64 * mN).add(256).multiply(mN).add(320).multiply(mN).add(128)))
        .divide(Z.valueOf(mN + 16).multiply(mN).add(85).multiply(mN).add(150));
    }
    return mB;
  }
}
