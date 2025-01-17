package irvine.oeis.a207;
// Generated by gen_seq4.pl trisimple at 2021-11-08 22:02

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A207260 Triangle T(n,k) with T(n,k) = k^2 + (1-(-1)^(n-k))/2.
 * @author Georg Fischer
 */
public class A207260 extends Triangle {

  /** Construct the sequence. */
  public A207260() {
    super(0);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(k * (long) k).add((Z.ONE.subtract((((n - k) & 1) == 0) ? 1 : -1)).divide2());
  }
}
