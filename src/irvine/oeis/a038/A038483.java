package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A038483 Sums of 4 distinct powers of 7.
 * @author Sean A. Irvine
 */
public class A038483 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(15) : ZUtils.swizzle(mN);
    return new Z(mN.toString(2), 7);
  }
}
