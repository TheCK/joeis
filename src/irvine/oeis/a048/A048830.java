package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a014.A014221;

/**
 * A048830 Number of rooted identity game trees of height &lt;=n, first player to reach to reach top wins. First player wins.
 * @author Sean A. Irvine
 */
public class A048830 extends A014221 {

  private final MemorySequence mC = MemorySequence.cachedSequence(new A014221());
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return mN == 1 ? Z.ZERO : Z.ONE;
    }
    return mC.a(mN).subtract(Z.ONE.shiftLeft(mC.a(mN - 1).intValueExact() - mC.a(mN - 2).intValueExact()));
  }
}
