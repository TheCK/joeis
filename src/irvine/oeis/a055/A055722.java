package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055722 Sigma_3(n)/n &gt; Sigma_3(k)/k for all k &lt; n.
 * @author Sean A. Irvine
 */
public class A055722 implements Sequence {

  private Q mBest = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Q t = new Q(Cheetah.factor(n).sigma(3), n);
      if (t.compareTo(mBest) > 0) {
        mBest = t;
        return n;
      }
    }
  }
}
