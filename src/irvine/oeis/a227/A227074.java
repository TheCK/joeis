package irvine.oeis.a227;
// Generated by gen_seq4.pl wraptr1 at 2021-10-17 19:42

import irvine.oeis.a000.A000302;
import irvine.oeis.triangle.WrappedRecurrence;

/**
 * A227074 A triangle formed like Pascal's triangle, but with 4^n on the borders instead of 1.
 * @author Georg Fischer
 */
public class A227074 extends WrappedRecurrence {

  /** Construct the sequence. */
  public A227074() {
    super(new A000302());
  }
}
