package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030594 Position of n-th 5 in A030588.
 * @author Sean A. Irvine
 */
public class A030594 extends A030588 {

  private long mN = 0;

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

