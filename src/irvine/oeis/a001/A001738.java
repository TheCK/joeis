package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001738 a(n) = n^2 written in base 3.
 * @author Sean A. Irvine
 */
public class A001738 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Z.valueOf(++mN).square().toString(3));
  }

}
