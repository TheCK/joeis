package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026877 T(2n+1,n+2), T given by A026758.
 * @author Sean A. Irvine
 */
public class A026877 extends A026758 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 2);
  }
}
