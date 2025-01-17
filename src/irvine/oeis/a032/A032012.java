package irvine.oeis.a032;

import irvine.math.MemoryFunctionInt3;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032012 Number of ways to partition n labeled elements into sets of different odd sizes and order the sets.
 * @author Sean A. Irvine
 */
public class A032012 extends MemoryFunctionInt3<Z> implements Sequence {

  // After Alois P. Heinz

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  protected Z compute(final int n, final int k, final int p) {
    if (n == 0) {
      return mF.factorial(p);
    }
    if (k < 1) {
      return Z.ZERO;
    }
    Z res = get(n, k - 2, p);
    if (k <= n) {
      res = res.add(get(n - k, k - 2, p + 1).multiply(Binomial.binomial(n, k)));
    }
    return res;
  }

  @Override
  public Z next() {
    return get(++mN, mN - 1 + (mN & 1), 0);
  }
}
