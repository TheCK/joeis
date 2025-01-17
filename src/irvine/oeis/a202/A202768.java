package irvine.oeis.a202;
// Generated by gen_seq4.pl prodsi2 at 2021-11-25 14:02

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A202768 Vandermonde determinant of the first n squares.
 * @author Georg Fischer
 */
public class A202768 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 1; j <= k - 1; ++j) {
        prod = prod.multiply(Z.valueOf(k * k).subtract(Z.valueOf(j * j)));
      }
    }
    return prod;
  }
}
