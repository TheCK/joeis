package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035075 a(n) = ceiling(sqrt(8*10^n)).
 * @author Sean A. Irvine
 */
public class A035075 implements Sequence {

  private Z mA = Z.EIGHT;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    return CR.valueOf(mA).sqrt().ceil();
  }
}
