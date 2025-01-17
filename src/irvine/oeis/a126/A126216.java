package irvine.oeis.a126;
// Generated by gen_seq4.pl transpose at 2021-11-10 23:22

import irvine.oeis.a033.A033282;
import irvine.oeis.triangle.Transpose;

/**
 * A126216 Triangle read by rows: T(n,k) is the number of Schroeder paths of semilength n containing exactly k peaks but no peaks at level one (n &gt;= 1; 0 &lt;= k &lt;= n-1).
 * @author Georg Fischer
 */
public class A126216 extends Transpose {

  /** Construct the sequence. */
  public A126216() {
    super(new A033282());
  }
}
