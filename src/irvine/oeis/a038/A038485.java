package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A038485 Sums of 3 distinct powers of 8.
 * @author Sean A. Irvine
 */
public class A038485 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.SEVEN : ZUtils.swizzle(mN);
    return new Z(mN.toString(2), 8);
  }
}
