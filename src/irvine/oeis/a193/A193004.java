package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193004 Constant term of the reduction by <code>x^2-&gt;x+1</code> of the polynomial <code>p(n,x)</code> defined at Comments.
 * @author Sean A. Irvine
 */
public class A193004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193004() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {1, 1, 9, 29, 75});
  }
}
