package irvine.oeis.a255;
// Generated by gen_seq4.pl trisimple/trisimara at 2021-11-07 23:41

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A255044 Array A read by upward antidiagonals: A(n,k) = ((2*n+1)*9^k-1)/2, n,k &gt;= 0.
 *
 * @author Georg Fischer
 */
public class A255044 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A255044() {
    super(0, 0, 1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.NINE.pow(k).multiply(2 * n + 1).subtract(1).divide2();
  }
}
