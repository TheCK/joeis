package irvine.oeis.a049;

import irvine.math.z.InfinitaryDivisors;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049417 a(n) = isigma(n): sum of infinitary divisors of n.
 * @author Sean A. Irvine
 */
public class A049417 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return InfinitaryDivisors.infinitarySigma(mN).add(mN);
  }
}

