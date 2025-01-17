package irvine.oeis.a132;
// Generated by gen_seq4.pl trisimple at 2021-11-08 22:02

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A132898 Triangle read by rows: T(n,k) = (-1)^(n-1)*n + (-1)^(k-1)*k - 1, 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A132898 extends Triangle {

  /** Construct the sequence. */
  public A132898() {
    super(0);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf((((n & 1) == 0) ? 1 : -1) * (n + 1)).add((((k & 1) == 0) ? 1 : -1) * (k + 1)).subtract(1);
  }
}
