package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011876 [ n(n-1)/23 ].
 * @author Sean A. Irvine
 */
public class A011876 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(23);
  }
}
