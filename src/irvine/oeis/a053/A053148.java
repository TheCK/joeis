package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A053148 When cototient function (A051953) is iterated with initial value A002110(n), a(n) = exponent of the largest power of 2 which appears in the iteration.
 * @author Sean A. Irvine
 */
public class A053148 extends A002110 {

  {
    super.next();
  }

  @Override
  public Z next() {
    Z m = super.next();
    while (!Z.ONE.equals(m.makeOdd())) {
      m = m.subtract(Jaguar.factor(m).phi());
    }
    return Z.valueOf(m.auxiliary());
  }
}
