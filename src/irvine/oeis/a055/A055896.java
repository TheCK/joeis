package irvine.oeis.a055;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000110;

/**
 * A055896 Exponential transform of Stirling2 triangle A008277.
 * @author Sean A. Irvine
 */
public class A055896 implements Sequence {

  private int mN = 0;
  private int mM = 0;
  private Sequence mBell = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mBell = new A000110();
      mBell.next(); // skip 0
      mM = 1;
    }
    return mBell.next().multiply(Stirling.secondKind(mN, mM));
  }
}
