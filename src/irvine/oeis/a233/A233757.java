package irvine.oeis.a233;
// Generated by gen_seq4.pl trisimple at 2021-11-08 22:02

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A233757 Triangle read by rows: T(n,k) = (2^n-1)*2^(k-1), for n &gt;= 1 and 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A233757 extends Triangle {

  /** Construct the sequence. */
  public A233757() {
    super(0);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.ONE.shiftLeft(n + 1).subtract(1).multiply(Z.ONE.shiftLeft(k));
  }
}
