package irvine.oeis.a211;
// Generated by gen_seq4.pl trisimple/trisimard at 2021-11-07 23:41

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A211377 T(n,k) = ((k + n)^2 - 4*k + 3 + (-1)^k - (k + n - 2)*(-1)^(k + n))/2; n, k &gt; 0, read by antidiagonals.
 *
 * @author Georg Fischer
 */
public class A211377 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A211377() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(k + n).square().add(-4 * k + 3 + (((k & 1) == 0) ? 1 : -1)).subtract((((k + n) & 1) == 0) ? k + n - 2 : -k - n + 2).divide2();
  }
}
