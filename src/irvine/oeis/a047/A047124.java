package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047124 T(n,n-2), array T as in A047120.
 * @author Sean A. Irvine
 */
public class A047124 extends A047120 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}
