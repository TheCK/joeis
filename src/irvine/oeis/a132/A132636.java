package irvine.oeis.a132;
// manually 2021-08-15

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A132636 a(n) = Fibonacci(n) mod n^3.
 * @author Georg Fischer
 */
public class A132636 extends A000045 {

  private Z mN = Z.ZERO;

  {
    super.next();
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return super.next().mod(mN.pow(3));
  }
}
