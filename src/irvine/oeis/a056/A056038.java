package irvine.oeis.a056;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056038 Largest factorial k! such that (k!)^2 divides n!.
 * @author Sean A. Irvine
 */
public class A056038 implements Sequence {

  private int mN = 0;
  private int mK = 1;

  @Override
  public Z next() {
    final Z f = MemoryFactorial.SINGLETON.factorial(++mN);
    while (f.mod(MemoryFactorial.SINGLETON.factorial(mK).square()).isZero()) {
      ++mK;
    }
    return MemoryFactorial.SINGLETON.factorial(mK - 1);
  }
}
