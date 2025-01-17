package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057269 a(n-1)+k=a(n) =&gt; a(n)^k=a(n+1).
 * @author Georg Fischer
 */
public class A057269 implements Sequence {

  private int mN = -1;
  ;
  private Z mA0;
  private Z mA1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      mA0 = Z.ONE;
      return mA0;
    }
    if (mN == 1) {
      mA1 = Z.THREE;
      return mA1;
    }
    final Z k = mA1.subtract(mA0);
    final Z result = mA1.pow(k);
    mA0 = mA1;
    mA1 = result;
    return result;
  }
}
