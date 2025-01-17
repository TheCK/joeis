package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052764 E.g.f.: -1/4*LambertW(-4*x).
 * @author Sean A. Irvine
 */
public class A052764 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN - 1).shiftLeft(2 * mN - 2);
  }
}
