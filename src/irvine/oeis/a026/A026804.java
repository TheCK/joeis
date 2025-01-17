package irvine.oeis.a026;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026804 Number of partitions of n in which the least part is odd.
 * @author Sean A. Irvine
 */
public class A026804 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private long mN = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n < 1 || m < 1) {
      return Z.ZERO;
    }
    Z t = get(n, m - 1);
    if (n.equals(m)) {
      t = t.add(n & 1);
    }
    if (m <= n) {
      t = t.add(get(n - m, m));
    }
    return t;
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
