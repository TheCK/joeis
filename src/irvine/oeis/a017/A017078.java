package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017078 a(n) = (8*n + 1)^2.
 * @author Sean A. Irvine
 */
public class A017078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017078() {
    super(new long[] {1, -3, 3}, new long[] {1, 81, 289});
  }
}
