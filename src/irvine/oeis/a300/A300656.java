package irvine.oeis.a300;
// Generated by gen_seq4.pl trisimple at 2021-11-08 22:02

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A300656 Triangle read by rows: T(n,k) = 30*k^2*(n-k)^2 + 1; n &gt;= 0, 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A300656 extends Triangle {

  /** Construct the sequence. */
  public A300656() {
    super(0);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(30L * k * k).multiply(n - k).multiply(n - k).add(1);
  }
}
