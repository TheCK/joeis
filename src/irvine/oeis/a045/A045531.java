package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045531 Number of sticky functions: endofunctions of [n] having a fixed point.
 * @author Sean A. Irvine
 */
public class A045531 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN).subtract(Z.valueOf(mN - 1).pow(mN));
  }
}
