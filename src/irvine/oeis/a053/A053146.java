package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A053146 When cototient function (A051953) is iterated with initial value A002110(n), a(n) = number of iterates that are not powers of 2.
 * @author Sean A. Irvine
 */
public class A053146 extends A002110 {

  {
    super.next();
  }

  @Override
  public Z next() {
    Z m = super.next();
    long cnt = 1;
    while (!Z.ONE.equals(m.makeOdd())) {
      m = m.subtract(Jaguar.factor(m).phi());
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
