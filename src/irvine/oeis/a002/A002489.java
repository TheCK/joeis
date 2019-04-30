package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002489 <code>a(n) = n^(n^2)</code>, or <code>(n^n)^n</code>.
 * @author Sean A. Irvine
 */
public class A002489 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(mN.square().intValueExact());
  }
}
