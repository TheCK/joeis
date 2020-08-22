package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A022854 a(n) = [ a(n-1)/a(1) + a(n-1)/a(2) + ... + a(n-1)/a(n-1) ] for n &gt;= 3.
 * @author Sean A. Irvine
 */
public class A022854 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    }
    Q sum = Q.ZERO;
    final Z num = get(n - 1);
    for (final Z a : this) {
      sum = sum.add(new Q(num, a));
    }
    return sum.toZ();
  }
}
