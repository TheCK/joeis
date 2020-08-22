package irvine.oeis.a316;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A316387 Consider coefficients U(m,L,k) defined by the identity Sum_{k=1..L} Sum_{j=0..m} A302971(m,j)/A304042(m,j) * k^j * (T-k)^j = Sum_{k=0..m} (-1)^(m-k) * U(m,L,k) * T^k that holds for all positive integers L,m,T. This sequence gives 4-column table read by rows, where the n-th row lists coefficients U(3,n,k) for k = 0, 1, 2, 3; n &gt;= 1.
 * @author Georg Fischer
 */
public class A316387 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A316387() {
    super(1, new long[] {0, 125, 406, 420, 140, 8028, 10570, 3780, 140, 42237, 16660, -4200, 
      -1120, 42272, -16660, -4200, 1120, 8007, -10570, 3780, -140, 132, 
      -406, 420, -140, -1},
      new long[] {1, 0, 0, 0, -8, 0, 0, 0, 28, 0, 0, 0, -56, 0, 0, 0, 70, 0, 
      0, 0, -56, 0, 0, 0, 28, 0, 0, 0, -8, 0, 0, 0, 1});
  }
}
