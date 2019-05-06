package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000045;

/**
 * A020995.
 * @author Sean A. Irvine
 */
public class A020995 extends A000045 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.digitSum(super.next()) == ++mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
