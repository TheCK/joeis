package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017820 Expansion of 1/(1-x^3-x^4-x^5-x^6-x^7).
 * @author Sean A. Irvine
 */
public class A017820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017820() {
    super(new long[] {1, 1, 1, 1, 1, 0, 0}, new long[] {1, 0, 0, 1, 1, 1, 2});
  }
}
