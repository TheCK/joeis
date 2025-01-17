package irvine.oeis.a131;
// Generated by gen_seq4.pl wraptr2 at 2021-10-17 19:42

import irvine.oeis.a080.A080956;
import irvine.oeis.triangle.WrappedRecurrence;

/**
 * A131085 Triangle T(n,k) (n&gt;=0, 0&lt;=k&lt;=n-1) read by rows, A007318 * A129686.
 * @author Georg Fischer
 */
public class A131085 extends WrappedRecurrence {

  /** Construct the sequence. */
  public A131085() {
    super(new A080956(), "1");
  }
}
