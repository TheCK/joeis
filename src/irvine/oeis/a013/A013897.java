package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013897 a(n) = 20^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013897 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(160000) : mA.multiply(3200000);
    return mA;
  }
}
