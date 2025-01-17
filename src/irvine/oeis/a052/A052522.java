package irvine.oeis.a052;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052522 Number of labeled mobiles with cycles of length at least 3.
 * @author Sean A. Irvine
 */
public class A052522 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j <= k; ++j) {
        Z t = Z.ZERO;
        for (int l = 0; l <= j; ++l) {
          Z u = Z.ZERO;
          for (int i = 0; i <= l; ++i) {
            u = u.signedAdd(((i + mN + l - 1) & 1) == 0, mF.factorial(mN + k - 1).multiply(Binomial.binomial(l, i)).multiply(Stirling.firstKind(mN + j - i - l - 1, j - l)).shiftLeft(l - 2 * i).divide(mF.factorial(mN + j - i - l - 1)));
          }
          t = t.add(u.divide(mF.factorial(l)));
        }
        sum = sum.add(t.divide(mF.factorial(k - j)));
      }
    }
    return sum;
  }
}
