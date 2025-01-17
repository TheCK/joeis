package irvine.oeis.a049;
// Generated by gen_seq4.pl triuple at 2021-10-25 19:35

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A049581 Table T(n,k) = |n-k| read by antidiagonals (n &gt;= 0, k &gt;= 0).
 *
 * @author Georg Fischer
 */
public class A049581 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A049581() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int i, final int j) {
    return Z.valueOf(Math.abs(i - j));
  }
}
