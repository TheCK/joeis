package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022019 Define the sequence <code>S(a(0), a(1))</code> by <code>a(n+2)</code> is the least integer such that <code>a(n+2)/a(n+1) &gt; a(n+1)/a(n)</code> for <code>n &gt;= 0</code> . This is <code>S(2,32)</code>.
 * @author Sean A. Irvine
 */
public class A022019 implements Sequence {

  // After Robert Israel

  private Z mA = null;
  private Z mB = null;
  private boolean mC = false;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.TWO;
        return Z.TWO;
      }
      mB = Z.valueOf(32);
    } else {
      mC = !mC;
      final Q q = new Q(mB.square(), mA);
      final Z t = mC ? q.add(1).floor() : q.subtract(1).ceiling();
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
