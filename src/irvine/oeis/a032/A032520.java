package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032520 Sum of the integer part of <code>13/3-th</code> roots of integers less than <code>n</code>.
 * @author Sean A. Irvine
 */
public class A032520 implements Sequence {

  private Z mN = Z.NEG_ONE;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    mSum = mSum.add(mN.pow(3).root(13));
    return mSum;
  }
}
