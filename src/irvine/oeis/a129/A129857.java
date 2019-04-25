package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129857 Nonnegative values x of solutions <code>(x, y)</code> to the Diophantine equation <code>x^2+(x+857)^2 = y^2</code>.
 * @author Sean A. Irvine
 */
public class A129857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129857() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 235, 1696, 2571, 3796, 12075, 17140});
  }
}
