package irvine.oeis.a306;
// Generated by gen_seq4.pl prodsi2 at 2021-11-20 22:11

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A306728 a(n) = Product_{i=1..n, j=1..n} (i*(i+1) + j*(j+1)).
 * @author Georg Fischer
 */
public class A306728 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int i = 1; i <= mN; ++i) {
      for (int j = 1; j <= mN; ++j) {
        prod = prod.multiply(Z.valueOf(i * (i + 1) + j * (j + 1)));
      }
    }
    return prod;
  }
}
