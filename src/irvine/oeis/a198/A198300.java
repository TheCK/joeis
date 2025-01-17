package irvine.oeis.a198;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A198300 Square array M(k,g), read by antidiagonals, of the Moore lower bound on the order of a (k,g)-cage.
 * @author Sean A. Irvine
 */
public class A198300 extends MemoryFunction2<Integer, Z> implements Sequence {

  protected int mN = 0;
  protected int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (m == 3) {
      return Z.valueOf(n + 1);
    }
    return get(n, m - 1).add(Z.valueOf(n - 1).pow((m - 1) / 2));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return get(mN + 1 - mM, mM + 3);
  }
}
