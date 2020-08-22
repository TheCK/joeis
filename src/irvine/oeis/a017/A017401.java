package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017401 a(n) = 11n + 1.
 * @author Sean A. Irvine
 */
public class A017401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017401() {
    super(new long[] {-1, 2}, new long[] {1, 12});
  }
}
