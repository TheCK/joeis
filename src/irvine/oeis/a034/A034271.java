package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034271 a(n)=f(n,n+4) where f is given in A034261.
 * @author Sean A. Irvine
 */
public class A034271 extends A034261 {

  private long mN = -1;

  @Override
  public Z next() {
    return f(++mN, mN + 4);
  }
}

