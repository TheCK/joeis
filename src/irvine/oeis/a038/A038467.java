package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A038467 Sums of 5 distinct powers of 3.
 * @author Sean A. Irvine
 */
public class A038467 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(31) : ZUtils.swizzle(mN);
    return new Z(mN.toString(2), 3);
  }
}
