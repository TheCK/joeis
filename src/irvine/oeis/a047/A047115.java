package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047115 T(n,n-3), array T as in A047110.
 * @author Sean A. Irvine
 */
public class A047115 extends A047110 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
