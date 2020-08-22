package irvine.oeis.a094;
// Generated by gen_seq4.pl trigf 1, -1, 0 1, -2, -1, 1, 1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A094436 Triangular array T(n,k) = Fibonacci(k+1)*binomial(n,k) for k = 0..n; n &gt;= 0.
 * @author Georg Fischer
 */
public class A094436 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A094436() {
    super(0, new long[] {1, -1, 0}, new long[] {1, -2, -1, 1, 1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
