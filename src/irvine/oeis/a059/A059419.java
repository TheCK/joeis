package irvine.oeis.a059;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059419 Triangle <code>T(n,k) (1 &lt;= k &lt;= n)</code> of tangent numbers, read by rows: <code>T(n,k) =</code> coefficient of <code>x^n/n!</code> in expansion of (tan <code>x)^k/k!</code>.
 * @author Sean A. Irvine
 */
public class A059419 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n.equals(k)) {
      return Z.ONE;
    }
    if (k < 0 || k > n) {
      return Z.ZERO;
    }
    return get(n - 1, k - 1).add(get(n - 1, k + 1).multiply(k).multiply(k + 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
