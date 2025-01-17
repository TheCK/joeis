package irvine.oeis.a309;
// Generated by gen_seq4.pl trisimple at 2021-11-08 22:02

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A309557 Number triangle with T(n,k) = 2 + 3*n - 2*k + 2*k*(n-k) for n &gt;= 0, 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A309557 extends Triangle {

  /** Construct the sequence. */
  public A309557() {
    super(0);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(2 + 3 * n - 2 * k + 2 * k * (n - k));
  }
}
