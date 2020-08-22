package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031646 Numbers n such that continued fraction for sqrt(n) has odd period and central terms 58.
 * @author Sean A. Irvine
 */
public class A031646 extends A031414 {

  @Override
  protected Z target() {
    return Z.valueOf(58);
  }
}
