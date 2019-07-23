package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a004.A004431;

/**
 * A024512 Position of <code>1 + n^2</code> in <code>A004431</code> (sums of 2 distinct nonzero squares).
 * @author Sean A. Irvine
 */
public class A024512 extends A004431 {

  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mM).square().add(1);
    while (true) {
      ++mN;
      if (super.next().equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
