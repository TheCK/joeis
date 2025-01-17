package irvine.oeis.a050;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050980 Haupt-exponents of 8 modulo integers relatively prime to 8.
 * @author Sean A. Irvine
 */
public class A050980 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    return new IntegersModMul(mN).order(Z.EIGHT);
  }
}
