package irvine.oeis.a054;

import irvine.math.z.Euler;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054630 T(n,k) = Sum_{d|k} phi(d)*n^(k/d)/k, triangle read by rows, T(n,k) for n &gt;= 1 and 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A054630 implements Sequence {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Integers.SINGLETON.sumdiv(mM, d -> Euler.phi(Z.valueOf(d)).multiply(Z.valueOf(mN).pow(mM / d))).divide(mM);
  }
}
