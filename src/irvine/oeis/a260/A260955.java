package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260955 Differences of the increasing arithmetic progression <code>a^2+a, b^2+b</code>, c^2+c, where <code>b = 5*a+2</code>, c <code>= 7*a+3</code> and <code>a &gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A260955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260955() {
    super(new long[] {1, -3, 3}, new long[] {6, 54, 150});
  }
}
