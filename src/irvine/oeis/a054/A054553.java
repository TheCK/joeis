package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A054553 Prime number spiral (clockwise, Northeast spoke).
 * @author Sean A. Irvine
 */
public class A054553 extends A000040 {

  private long mN = 0;
  private long mPi = 1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return super.next();
    }
    final long t = 4 * mN * mN - 10 * mN + 6;
    while (mPi < t) {
      super.next();
      ++mPi;
    }
    ++mPi;
    return super.next();
  }
}
