package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025146 <code>(#1</code>'s in <code>(s(1),...,s(n)) - (#1</code>'s in <code>r(1),...,r(n))</code>, where s <code>= A025142</code> and r <code>= A025143</code>.
 * @author Sean A. Irvine
 */
public class A025146 extends A025144 {

  protected long mCount = 0;

  @Override
  protected boolean select(final long n) {
    if (!mA025142.isSet(n)) {
      ++mCount;
    }
    if (!mA025143.isSet(n)) {
      --mCount;
    }
    return false;
  }

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mCount);
  }
}