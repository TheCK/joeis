package irvine.oeis.a203;
// Generated by gen_seq4.pl prodsi2 at 2021-11-25 14:02

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A203470 a(n) = Product_{2 &lt;= i &lt; j &lt;= n+1} (i + j).
 * @author Georg Fischer
 */
public class A203470 implements Sequence {

  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 3; k <= mN + 1; ++k) {
      for (int j = 2; j <= k - 1; ++j) {
        prod = prod.multiply(Z.valueOf(k + j));
      }
    }
    return prod;
  }
}
