package irvine.oeis.a135;
// Generated by gen_seq4.pl wraptr1 at 2021-10-17 19:42

import irvine.oeis.a122.A122553;
import irvine.oeis.triangle.WrappedRecurrence;

/**
 * A135087 Triangle T(n, k) = 2*A134058(n, k) - 1, read by rows.
 * @author Georg Fischer
 */
public class A135087 extends WrappedRecurrence {

  /** Construct the sequence. */
  public A135087() {
    super(new A122553());
    setPlus("1");
  }
}
