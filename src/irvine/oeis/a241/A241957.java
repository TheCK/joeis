package irvine.oeis.a241;
// Generated by gen_seq4.pl trisimple/trisimara at 2021-11-08 22:02

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A241957 Rectangular array A read by upward antidiagonals in which the entry in row n and column k is defined by A(n,k) = 2^n*(2*k - 1) - 1, n,k &gt;= 1.
 * @author Georg Fischer
 */
public class A241957 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A241957() {
    super(1, 1, 1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.ONE.shiftLeft(n).multiply(2 * k - 1).subtract(1);
  }
}
