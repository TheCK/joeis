package irvine.oeis.a046;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046716 Coefficients of a special case of Poisson-Charlier polynomials.
 * @author Sean A. Irvine
 */
public class A046716 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Peter Luschny

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM).abs();
  }

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m <= 0) {
      return m == 0 ? Z.ONE : Z.ZERO;
    }
    if (m.equals(n)) {
      return (n & 1) == 0 ? Z.ONE : Z.NEG_ONE;
    }
    return get(n - 1, m).subtract(get(n - 1, m - 1).multiply(n)).subtract(get(n - 2, m - 2).multiply(n - 1));
  }
}
