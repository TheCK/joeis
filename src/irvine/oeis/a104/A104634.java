package irvine.oeis.a104;
// Generated by gen_seq4.pl trisimple at 2021-11-07 23:41

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A104634 Triangle T(n,k) = (k-1-n)*(k-2-n)*(k+2*n)/6, 1&lt;=k&lt;=n.
 *
 * @author Georg Fischer
 */
public class A104634 extends Triangle {

  /** Construct the sequence. */
  public A104634() {
    super(1);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(k - 1 - n).multiply(k - 2 - n).multiply(k + 1 + 2 * (n + 1)).divide(6);
  }
}
