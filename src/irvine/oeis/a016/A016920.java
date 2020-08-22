package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016920 a(n) = (6*n)^12.
 * @author Sean A. Irvine
 */
public class A016920 implements Sequence {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    mN = mN.add(6);
    return mN.pow(12);
  }
}

