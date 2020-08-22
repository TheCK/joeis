package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031316 Position of n-th 3 in A031312.
 * @author Sean A. Irvine
 */
public class A031316 extends A031312 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.THREE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

