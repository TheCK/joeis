package irvine.oeis.a096;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A096037 Triangle T(n,m) = (3*n+3*m-2)*(n+1-m)/2 read by rows.
 * @author Georg Fischer
 */
public class A096037 extends Triangle {

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    return Z.valueOf(3 * n + 3 * k - 2).multiply(Z.valueOf(n + 1 - k)).divide2();
  }
}
