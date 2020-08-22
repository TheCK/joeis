package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030581 a(n)=(# 1's)-(# 0's) in first n terms of A030567.
 * @author Sean A. Irvine
 */
public class A030581 extends A030567 {

  private Z mSum = Z.ZERO;
  {
    super.next();
  }

  @Override
  public Z next() {
    final int t = super.next().intValue();
    if (t == 1) {
      mSum = mSum.add(1);
    } else if (t == 0) {
      mSum = mSum.subtract(1);
    }
    return mSum;
  }
}

