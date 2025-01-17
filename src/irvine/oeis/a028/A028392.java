package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028392 a(n) = n + floor(sqrt(n)).
 * @author Sean A. Irvine
 */
public class A028392 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(mN.sqrt());
  }
}
