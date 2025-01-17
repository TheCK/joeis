package irvine.oeis.a203;
// Generated by gen_seq4.pl prodsi2 at 2021-11-25 14:02

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A203516 a(n) = Product_{1 &lt;= i &lt; j &lt;= n} 2*(i+j-1).
 * @author Georg Fischer
 */
public class A203516 implements Sequence {

  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      for (int j = 1; j <= k - 1; ++j) {
        prod = prod.multiply(Z.valueOf(2 * k - 1).add(Z.valueOf(2 * j - 1)));
      }
    }
    return prod;
  }
}
