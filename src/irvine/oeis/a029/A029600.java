package irvine.oeis.a029;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029600 Numbers in the (2,3)-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A029600 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (m == 0) {
      return Z.TWO;
    }
    if (n.equals(m)) {
      return Z.THREE;
    }
    return get(n - 1, m - 1).add(get(n - 1, m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
