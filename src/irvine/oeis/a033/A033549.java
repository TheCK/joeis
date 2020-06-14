package irvine.oeis.a033;
// Generated by gen_seq4.pl nthprimf 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A033549 Numbers n such that sum of digits of n-th prime equals sum of digits of n.
 * @author Georg Fischer
 */
public class A033549 extends A000040 {
  protected long mK = 0;
  protected Z mNP = null;

  protected boolean isOk() {
    return ZUtils.digitSum(mNP) == ZUtils.digitSum(mK);
  }

  @Override
  public Z next() {
    ++mK;
    mNP = super.next();
    while (!isOk()) {
      ++mK;
      mNP = super.next();
    }
    return Z.valueOf(mK);
  }
}
