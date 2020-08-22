package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033979 Trajectory of 1 under map n-&gt;47n+1 if n odd, n-&gt;n/2 if n even.
 * @author Sean A. Irvine
 */
public class A033979 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.isEven() ? mA.divide2() : mA.multiply(47).add(1);
    return mA;
  }
}
