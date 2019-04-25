package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072702 Last digit of <code>F(n)</code> is 4 where <code>F(n)</code> is the n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A072702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072702() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {9, 12, 18, 51, 69});
  }
}
