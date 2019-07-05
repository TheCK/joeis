package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024352.
 * @author Sean A. Irvine
 */
public class A024352 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    if (++mN == 4 || (mN & 3) == 2) {
      ++mN;
    }
    return Z.valueOf(mN);
  }
}