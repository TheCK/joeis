package irvine.oeis.a090;
// Generated by gen_seq4.pl transpose at 2021-11-10 23:22

import irvine.oeis.a019.A019538;
import irvine.oeis.triangle.Transpose;

/**
 * A090582 T(n, k) = Sum_{j=0..n-k} (-1)^j*binomial(n - k + 1, j)*(n - k + 1 - j)^n. Triangle read by rows, T(n, k) for 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A090582 extends Transpose {

  /** Construct the sequence. */
  public A090582() {
    super(new A019538());
  }
}
