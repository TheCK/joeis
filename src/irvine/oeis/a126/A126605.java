package irvine.oeis.a126;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A126605 Final three digits of 2^n.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A126605 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN = mN == -1 ? 1 : (mN * 2) % 1000;
    return Z.valueOf(mN);
  }
}
