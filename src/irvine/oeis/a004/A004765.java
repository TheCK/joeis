package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004765 Numbers whose binary expansion does not begin 111.
 * @author Sean A. Irvine
 */
public class A004765 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    do {
      mN = mN.add(1);
    } while (mN.toString(2).startsWith("111"));
    return mN;
  }
}

