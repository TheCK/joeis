package irvine.oeis.a122;
// Generated by gen_seq4.pl trisimple at 2021-11-08 22:02

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A122750 Triangle T(n,k) = (-1)^(k+1) if n is odd, = (-1)^k if n and k are even, = 2*(-1)^k if n is even and k is odd, 0&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A122750 extends Triangle {

  /** Construct the sequence. */
  public A122750() {
    super(0);
  }

  @Override
  public Z compute(final int n, final int k) {
    return (n & 1) == 1 ? Z.valueOf(((k + 1) & 1) == 0 ? 1 : -1) : ((k & 1) == 0 ? Z.valueOf((k & 1) == 0 ? 1 : -1) : Z.valueOf(2 * ((k & 1) == 0 ? 1 : -1)));
  }
}
