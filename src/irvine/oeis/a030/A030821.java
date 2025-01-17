package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030821 [ exp(8/23)*n! ].
 * @author Sean A. Irvine
 */
public class A030821 implements Sequence {

  private static final CR EXP8_23 = CR.valueOf(new Q(8, 23)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP8_23.multiply(mF).floor();
  }
}
