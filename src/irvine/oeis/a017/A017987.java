package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017987.
 * @author Sean A. Irvine
 */
public class A017987 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(4);
    return mN.root(3).add(mN.auxiliary() == 1 ? 0 : 1);
  }
}

