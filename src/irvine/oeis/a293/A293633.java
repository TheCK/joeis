package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293633 <code>a(n)</code> is the integer k that minimizes <code>|k/Fibonacci(n) - 3/4|</code>.
 * @author Sean A. Irvine
 */
public class A293633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293633() {
    super(new long[] {-1, -1, 1, 0, 0, 0, 1, 1}, new long[] {1, 1, 2, 2, 4, 6, 10, 16});
  }
}
