package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030376 Position of n-th 2 in A030373.
 * @author Sean A. Irvine
 */
public class A030376 extends A030373 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.TWO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

