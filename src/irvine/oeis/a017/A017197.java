package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017197 a(n) = 9*n + 3.
 * @author Sean A. Irvine
 */
public class A017197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017197() {
    super(new long[] {-1, 2}, new long[] {3, 12});
  }
}
