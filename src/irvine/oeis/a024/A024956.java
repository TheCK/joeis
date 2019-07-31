package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024956 <code>a(n) = s(n+3)/7</code>, where s is <code>A024955</code>.
 * @author Sean A. Irvine
 */
public class A024956 extends A024955 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(7);
  }
}