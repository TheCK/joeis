package irvine.oeis.a078;
// Generated by gen_seq4.pl modpas2 at 2021-11-12 23:48

import irvine.math.z.Z;
import irvine.oeis.triangle.ModifiedPascalTriangle;

/**
 * A078341 Triangle read by rows: T(n,k) = n*T(n-1,k-1) + k*T(n-1,k) starting with T(0,0)=1.
 * @author Georg Fischer
 */
public class A078341 extends ModifiedPascalTriangle {

  @Override
  protected Z factorF(final long n, final long k) {
    return Z.valueOf(n);
  }

  @Override
  protected Z factorG(final long n, final long k) {
    return Z.valueOf(k);
  }

}
