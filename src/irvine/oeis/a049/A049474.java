package irvine.oeis.a049;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049474 a(n) = ceiling(n/sqrt(2)).
 * @author Sean A. Irvine
 */
public class A049474 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(++mN).divide(CR.SQRT2).ceil();
  }
}
