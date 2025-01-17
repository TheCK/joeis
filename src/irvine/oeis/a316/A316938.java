package irvine.oeis.a316;
// Generated by gen_seq4.pl wraptr1 at 2021-10-17 19:42

import irvine.oeis.a000.A000045;
import irvine.oeis.triangle.WrappedRecurrence;

/**
 * A316938 Triangle read by rows formed using Pascal's rule except that n-th row begins and ends with Fibonacci(n+4).
 * @author Georg Fischer
 */
public class A316938 extends WrappedRecurrence {

  /** Construct the sequence. */
  public A316938() {
    super(new A000045());
    skipLeft(4);
    skipRight(4);
  }
}
