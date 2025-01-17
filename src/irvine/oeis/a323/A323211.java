package irvine.oeis.a323;
// Generated by gen_seq4.pl wraptr1 at 2021-10-17 19:42

import irvine.oeis.a057.A057428;
import irvine.oeis.triangle.WrappedRecurrence;

/**
 * A323211 Level 1 of Pascal's pyramid. T(n, k) triangle read by rows for n &gt;= 0 and 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A323211 extends WrappedRecurrence {

  /** Construct the sequence. */
  public A323211() {
    super("1");
    setPlus(new A057428());
  }
}
