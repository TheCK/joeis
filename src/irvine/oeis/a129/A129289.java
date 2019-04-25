package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129289 Nonnegative values x of solutions <code>(x, y)</code> to the Diophantine equation <code>x^2+(x+73)^2 = y^2</code>.
 * @author Sean A. Irvine
 */
public class A129289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129289() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 44, 95, 219, 455, 744, 1460});
  }
}
