package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A022020 Define the sequence S(a(0),a(1)) by a(n+2) is the least integer such that a(n+2)/a(n+1) &gt; a(n+1)/a(n) for n &gt;= 0. This is S(3,9).
 * @author Sean A. Irvine
 */
public class A022020 extends PisotSequence {

  /** Construct the sequence. */
  public A022020() {
    super(3, 9, Q.ONE);
  }
}
