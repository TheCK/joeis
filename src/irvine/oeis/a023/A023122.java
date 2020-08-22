package irvine.oeis.a023;

import irvine.math.cr.CR;
import irvine.math.q.Q;

/**
 * A023122 Signature sequence of sqrt(3/2) (arrange the numbers i+j*x (i,j &gt;= 1) in increasing order; the sequence of i's is the signature of x).
 * @author Sean A. Irvine
 */
public class A023122 extends A023117 {

  private static final CR N = CR.valueOf(new Q(3, 2)).sqrt();

  @Override
  protected CR getN() {
    return N;
  }
}
