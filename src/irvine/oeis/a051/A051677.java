package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000292;
import irvine.oeis.a000.A000332;

/**
 * A051677 Tetrahedron-tree numbers: a(n)=sum(b(m),m=1..n), b(m)=1, 1,3, 1,3,6, 1,3,6,10,..., 1,2,...,i*(i+1)2.
 * @author Sean A. Irvine
 */
public class A051677 extends A000332 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A000292());
  {
    super.next();
    super.next();
    super.next();
  }
  private Z mT = super.next();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      mT = super.next();
      mM = 0;
      ++mN;
    }
    return mT.add(mA.a(mM));
  }
}
