package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031032 Position of n-th 4 in A031027.
 * @author Sean A. Irvine
 */
public class A031032 extends A031027 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.FOUR.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

