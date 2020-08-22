package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028389 n-&gt;5n+1 if n odd, n/2 if n even.
 * @author Sean A. Irvine
 */
public class A028389 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.SEVEN;
    } else {
      mA = mA.isEven() ? mA.divide2() : mA.multiply(5).add(1);
    }
    return mA;
  }
}
