package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022932 a(n) is the number of powers Pi^m between e^n and e^(n+1).
 * @author Sean A. Irvine
 */
public class A022932 implements Sequence {

  private static final CR LOG = CR.PI.log().inverse();
  private long mN = -1;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR n1 = CR.valueOf(mN + 1);
    return LOG.multiply(n1).floor().subtract(LOG.multiply(n).floor());
  }
}
