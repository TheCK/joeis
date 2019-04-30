package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090248 <code>a(n) = 27a(n-1) - a(n-2)</code>, starting with <code>a(0) = 2</code> and <code>a(1) = 27</code>.
 * @author Sean A. Irvine
 */
public class A090248 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090248() {
    super(new long[] {-1, 27}, new long[] {2, 27});
  }
}
