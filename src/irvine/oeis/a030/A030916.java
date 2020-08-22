package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030916 [ exp(13/14)*n! ].
 * @author Sean A. Irvine
 */
public class A030916 implements Sequence {

  private static final CR EXP13_14 = CR.valueOf(new Q(13, 14)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP13_14.multiply(mF).floor();
  }
}
