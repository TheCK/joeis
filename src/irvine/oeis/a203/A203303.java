package irvine.oeis.a203;
// Generated by gen_seq4.pl prodsi2 at 2021-11-25 14:02

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A203303 Vandermonde determinant of the first n terms of (1,2,4,8,16,...).
 * @author Georg Fischer
 */
public class A203303 implements Sequence {

  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 1; j <= k - 1; ++j) {
        prod = prod.multiply(Z.ONE.shiftLeft(k - 1).subtract(Z.ONE.shiftLeft(j - 1)));
      }
    }
    return prod;
  }
}
