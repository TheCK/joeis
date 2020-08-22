package irvine.oeis.a023;

import irvine.math.cr.CR;

/**
 * A023126 Signature sequence of 1/e^2 (arrange the numbers i+j*x (i,j &gt;= 1) in increasing order; the sequence of i's is the signature of x).
 * @author Sean A. Irvine
 */
public class A023126 extends A023117 {

  private static final CR N = CR.E.multiply(CR.E).inverse();

  @Override
  protected CR getN() {
    return N;
  }
}
