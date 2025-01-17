package irvine.oeis.a046;

import irvine.math.MemoryFunction2;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046982 Numerators of Taylor series for tan(x + Pi/4).
 * @author Sean A. Irvine
 */
public class A046982 extends MemoryFunction2<Integer, Z> implements Sequence {

  // After Jean-Fran&ccedil;ois Alcover

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n == 0) {
      return m == 1 ? Z.ONE : Z.ZERO;
    }
    return get(n - 1, m - 1).multiply(m - 1).add(get(n - 1, m + 1).multiply(m + 1));
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN + 1; ++k) {
      sum = sum.add(get(mN, k));
    }
    return select(new Q(sum, mF));
  }
}
