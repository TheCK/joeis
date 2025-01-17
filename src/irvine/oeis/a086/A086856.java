package irvine.oeis.a086;
// Generated by gen_seq4.pl transpose at 2021-11-10 23:22

import irvine.oeis.a010.A010028;
import irvine.oeis.triangle.Transpose;

/**
 * A086856 Triangle read by rows: T(n,k) = one-half number of permutations of length n with exactly k rising or falling successions, for n &gt;= 1, 0 &lt;= k &lt;= n-1. T(1,0) = 1 by convention.
 * @author Georg Fischer
 */
public class A086856 extends Transpose {

  /** Construct the sequence. */
  public A086856() {
    super(new A010028());
  }
}
