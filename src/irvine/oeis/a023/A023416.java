package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023416 Number of 0's in binary expansion of n.
 * @author Sean A. Irvine
 */
public class A023416 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.ZERO.equals(mN) ? Z.ONE : Z.valueOf(mN.bitLength() - mN.bitCount());
  }
}
