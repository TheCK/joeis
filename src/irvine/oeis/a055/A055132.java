package irvine.oeis.a055;

import irvine.math.Mobius;
import irvine.math.z.Z;

/**
 * A055132 Moebius function (A008683) applied to each term in the triangle A055096.
 * @author Sean A. Irvine
 */
public class A055132 extends A055096 {

  @Override
  public Z next() {
    return Z.valueOf(Mobius.mobius(super.next().longValueExact()));
  }
}
