package irvine.oeis.a055;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A055314 Triangle T(n,k) read by rows: number of labeled trees with n nodes and k leaves, n &gt;= 2, 2 &lt;= k &lt;= n.
 * T(n, k) = (n!/k!)*Stirling2(n-2, n-k).
 * @author Georg Fischer
 */
public class A055314 extends Triangle {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  /** Construct the sequence. */
  public A055314() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return FACTORIAL.factorial(n + 2).divide(FACTORIAL.factorial(k + 2)).multiply(Stirling.secondKind(n, n - k));
  }
}
