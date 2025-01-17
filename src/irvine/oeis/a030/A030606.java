package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030606 Position of n-th 1 in A030604.
 * @author Sean A. Irvine
 */
public class A030606 extends A030604 {

  private long mN = 0;
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

