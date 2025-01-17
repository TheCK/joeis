package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139618 a(n) = 153*n + 18.
 * @author Sean A. Irvine
 */
public class A139618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139618() {
    super(new long[] {-1, 2}, new long[] {18, 171});
  }
}
