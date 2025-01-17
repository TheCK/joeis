package irvine.oeis.a267;

import irvine.math.q.Q;
import irvine.oeis.triangle.RationalTriangle;

/**
 * A267863 Numerators of the rational number triangle R(m, a) = (m - 2*a)/(2*m), m &gt;= 1, a = 1, ..., m. This is a regularized Sum_{j &gt;= 0} (a + m*j)^(-s) for s = 0 defined by analytic continuation of a generalized Hurwitz Zeta function.
 * This is a regularized Sum_{j &gt;= 0} (a + m*j)^(-s) for s = 0 defined by analytic continuation of a generalized Hurwitz Zeta function.
 * @author Georg Fischer
 */
public class A267863 extends RationalTriangle {

  /** Construct the sequence. */
  public A267863() {
    hasRAM(true);
  }

  @Override
  public Q compute(int m, int a) {
    ++m;
    ++a;
    return new Q(m - 2 * a, 2 * m);
  }
}
