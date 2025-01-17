package irvine.oeis.a006;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006150 Number of Dyck paths.
 * @author Sean A. Irvine
 */
public class A006150 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    return mF.factorial(2 * ++mN)
      .divide(mF.factorial(mN))
      .multiply(mF.factorial(2 * mN + 2))
      .divide(mF.factorial(mN + 1))
      .multiply(mF.factorial(2 * mN + 4))
      .divide(mF.factorial(mN + 2))
      .multiply(mF.factorial(2 * mN + 6))
      .divide(mF.factorial(mN + 3))
      .multiply(3628800)
      .divide(mF.factorial(mN + 7))
      .divide(mF.factorial(mN + 6))
      .divide(mF.factorial(mN + 5))
      .divide(mF.factorial(mN + 4));
  }
}

