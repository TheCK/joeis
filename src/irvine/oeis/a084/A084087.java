package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A084087 Numbers k not divisible by 3 such that the exponent of the highest power of 2 dividing k is even.
 * @author Georg Fischer
 */
public class A084087 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mN % 3 == 0 || (ZUtils.valuation(Z.valueOf(mN), Z.TWO) & 1) != 0) {
      ++mN;
    }
    return Z.valueOf(mN);
  }
}
