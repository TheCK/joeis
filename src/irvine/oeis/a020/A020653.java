package irvine.oeis.a020;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020653 Denominators in a certain bijection from positive integers to positive rationals.
 * @author Sean A. Irvine
 */
public class A020653 implements Sequence {

  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mN) {
        ++mN;
        mM = 1;
      }
      if (LongUtils.gcd(mM, mN) == 1) {
        return Z.valueOf(mN - mM);
      }
    }
  }
}
