package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023818 Sum of exponents in prime-power factorization of C(2n,n-2).
 * @author Sean A. Irvine
 */
public class A023818 extends A023847 {

  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(2 * ++mN, mN - 2));
  }
}

