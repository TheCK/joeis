package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A033649 Trajectory of 5 under map x-&gt;x + (x-with-digits-reversed).
 * @author Sean A. Irvine
 */
public class A033649 implements Sequence {

  private Z mA = null;
  
  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : mA.add(ZUtils.reverse(mA));
    return mA;
  }
}
