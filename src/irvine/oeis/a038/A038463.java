package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A038463 Sums of 12 distinct powers of 2.
 * @author Sean A. Irvine
 */
public class A038463 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(4095) : ZUtils.swizzle(mN);
    return mN;
  }
}
