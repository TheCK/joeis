package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081067 <code>Lucas(4n+2)+2</code>, or <code>5*Fibonacci(2n+1)^2</code>.
 * @author Sean A. Irvine
 */
public class A081067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081067() {
    super(new long[] {1, -8, 8}, new long[] {5, 20, 125});
  }
}
