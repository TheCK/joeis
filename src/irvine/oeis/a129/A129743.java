package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129743 <code>a(n) =</code> -(u^n-1)*(v^n-1) with u <code>= 2+sqrt(3)</code>, v <code>= 2-sqrt(3)</code>.
 * @author Sean A. Irvine
 */
public class A129743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129743() {
    super(new long[] {1, -5, 5}, new long[] {2, 12, 50});
  }
}
