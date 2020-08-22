package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031051 Position of n-th 5 in A031045.
 * @author Sean A. Irvine
 */
public class A031051 extends A031045 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.FIVE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

