package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026100 a(n) = number of the column of A026098 that contains n.
 * @author Sean A. Irvine
 */
public class A026100 extends A026098 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    while (!mUsed.containsKey(mN)) {
      super.next();
    }
    return Z.valueOf(mUsed.get(mN).right());
  }
}
