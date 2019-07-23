package irvine.oeis.a024;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A024709 Least prime divisor of <code>A024702(n)</code>.
 * @author Sean A. Irvine
 */
public class A024709 extends A024702 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Cheetah.factor(super.next()).toZArray()[0];
  }
}