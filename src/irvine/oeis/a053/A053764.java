package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053764 a(n) = 3^(n^2 - n).
 * @author Sean A. Irvine
 */
public class A053764 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.THREE.pow(++mN * mN - mN);
  }
}
