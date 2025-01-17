package irvine.oeis.a052;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052888 E.g.f. is series reversion of log(1+x)*exp(-x).
 * @author Sean A. Irvine
 */
public class A052888 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z nk = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Stirling.secondKind(mN, k).multiply(nk));
      nk = nk.multiply(mN);
    }
    return sum;
  }
}
