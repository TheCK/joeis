package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030811 a(n) = floor(exp(18/23) * n!).
 * @author Sean A. Irvine
 */
public class A030811 implements Sequence {

  private static final CR EXP18_23 = CR.valueOf(new Q(18, 23)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP18_23.multiply(mF).floor();
  }
}
