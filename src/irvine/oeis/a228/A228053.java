package irvine.oeis.a228;
// Generated by gen_seq4.pl wraptr1 at 2021-10-17 19:42

import irvine.oeis.a033.A033999;
import irvine.oeis.triangle.WrappedRecurrence;

/**
 * A228053 A triangle formed like Pascal's triangle, but with (-1)^(n+1) on the borders instead of 1.
 * @author Georg Fischer
 */
public class A228053 extends WrappedRecurrence {

  /** Construct the sequence. */
  public A228053() {
    super(new A033999());
    skipLeft(1);
    skipRight(1);
  }
}
