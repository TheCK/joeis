package irvine.oeis.a050;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a005.A005117;

/**
 * A050326 Number of factorizations of n into distinct squarefree numbers &gt; 1.
 * @author Sean A. Irvine
 */
public class A050326 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence squarefree = new SkipSequence(new A005117(), 1);
    DirichletSeries series = DirichletSeries.ONE;
    long s;
    while ((s = squarefree.next().intValueExact()) <= mN) {
      series = series.multiply(DirichletSeries.zetaNum(s, mN, Z.ONE), mN);
    }
    return series.coeff(mN);
  }
}
