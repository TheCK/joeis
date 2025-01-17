package irvine.oeis.a054;

import irvine.math.LongUtils;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054535 Square array giving Ramanujan sum T(n,k) = c_n(k) = Sum_{m=1..n, (m,n)=1} exp(2 Pi i m k / n), read by antidiagonals upwards (n &gt;= 1, k &gt;= 1).
 * @author Sean A. Irvine
 */
public class A054535 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final long n = mN + 1 - mM;
    final long g = n / LongUtils.gcd(n, mM);
    return Z.valueOf(LongUtils.phi(n) * Mobius.mobius(g) / LongUtils.phi(g));
  }
}
