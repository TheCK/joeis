package irvine.oeis.a131;
// Generated by gen_seq4.pl trisimple at 2021-11-08 22:02

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A131421 Triangle read by rows (n&gt;=1, 1&lt;=k&lt;=n): T(n,k) = 2*(n+k) - 3.
 * @author Georg Fischer
 */
public class A131421 extends Triangle {

  /** Construct the sequence. */
  public A131421() {
    super(1);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(2 * (n + k) + 1);
  }
}
