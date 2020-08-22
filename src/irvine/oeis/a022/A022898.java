package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022898 Number of solutions to c(1)*prime(2)+...+c(n)*prime(n+1) = 1, where c(i) = +-1 for i&gt;1, c(1) = 1.
 * @author Sean A. Irvine
 */
public class A022898 extends A022897 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2L, ++mN);
  }
}
