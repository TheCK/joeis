package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024946 s(n+3)/2, where s is A024945.
 * @author Sean A. Irvine
 */
public class A024946 extends A024945 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
