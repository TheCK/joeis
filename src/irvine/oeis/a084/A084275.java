package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A084275 Pseudo-random numbers: MS C 6.0 version.
 * @author Sean A. Irvine
 */
public class A084275 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    mN = mN * 214013L + 2531011L;
    return Z.valueOf((mN >>> 16) & 0x7FFF);
  }
}
