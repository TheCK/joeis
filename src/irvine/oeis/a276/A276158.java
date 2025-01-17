package irvine.oeis.a276;
// Generated by gen_seq4.pl trisimple at 2021-11-08 22:02

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A276158 Triangle read by rows: T(n,k) = 6*k*(n + 1 - k) for 0 &lt; k &lt;= n; for k = 0, T(n,0) = n + 1.
 * @author Georg Fischer
 */
public class A276158 extends Triangle {

  /** Construct the sequence. */
  public A276158() {
    super(0);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(k == 0 ? n + 1 : 6 * k * (n + 1 - k));
  }
}
