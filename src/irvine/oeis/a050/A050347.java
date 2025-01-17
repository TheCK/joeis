package irvine.oeis.a050;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;

/**
 * A050347 Number of ways to factor n into distinct factors with 2 levels of parentheses.
 * @author Sean A. Irvine
 */
public class A050347 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A050345());
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    DirichletSeries series = DirichletSeries.ONE;
    for (int k = 2; k <= mN; ++k) {
      series = series.multiply(DirichletSeries.zetaNum(k, mN, Z.ONE).pow(mA.a(k - 1).intValueExact(), mN), mN);
    }
    return series.coeff(mN);
  }
}
