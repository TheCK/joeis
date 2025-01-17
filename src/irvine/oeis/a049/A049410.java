package irvine.oeis.a049;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;

/**
 * A049410 A triangle of numbers related to triangle A049325.
 * @author Sean A. Irvine
 */
public class A049410 extends A049325 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    return super.next().multiply(mF.factorial(mN)).divide(mF.factorial(mM)).shiftRight(2 * (mN - mM));
  }
}
