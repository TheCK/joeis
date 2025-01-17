package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A053097 When the Euler phi function is iterated with initial value A002110(n) = primorial, a(n) = number of powers of 2 among iterates.
 * @author Sean A. Irvine
 */
public class A053097 extends A002110 {

  {
    super.next();
  }

  @Override
  public Z next() {
    Z s = super.next();
    while (!Z.ONE.equals(s.makeOdd())) {
      s = Jaguar.factor(s).phi();
    }
    return Z.valueOf(1 + s.auxiliary());
  }
}
