package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A053096 When the Euler phi function is iterated with initial value A002110(n) = primorial, a(n) = number of iterations required to reach the fixed number = 1.
 * @author Sean A. Irvine
 */
public class A053096 extends A002110 {

  {
    super.next();
  }

  @Override
  public Z next() {
    Z s = super.next();
    long cnt = 0;
    while (!Z.ONE.equals(s)) {
      ++cnt;
      s = Jaguar.factor(s).phi();
    }
    return Z.valueOf(cnt);
  }
}
