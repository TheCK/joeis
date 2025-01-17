package irvine.oeis.a256;
// Generated by gen_seq4.pl trisimple at 2021-11-08 22:02

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A256497 Triangle read by rows, sums of 2 distinct nonzero cubes: T(n,k) = (n+1)^3+k^3, 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A256497 extends Triangle {

  /** Construct the sequence. */
  public A256497() {
    super(0);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(n + 2).pow(3).add(Z.valueOf(k + 1).pow(3));
  }
}
