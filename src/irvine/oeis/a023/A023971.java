package irvine.oeis.a023;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023971 First bit in fractional part of binary expansion of 4th root of n.
 * @author Sean A. Irvine
 */
public class A023971 implements Sequence {

  private static final CR R = CR.FOUR.inverse();
  private long mN = 0;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.pow(CR.valueOf(++mN), R).multiply(CR.TWO).floor().testBit(0) ? Z.ONE : Z.ZERO;
  }
}
