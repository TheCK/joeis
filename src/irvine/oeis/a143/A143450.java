package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143450 Expansion of 1/(x^k*(1-x-2*x^(k+1))) for k=7.
 * @author Sean A. Irvine
 */
public class A143450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143450() {
    super(new long[] {2, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 3, 5, 7, 9, 11, 13, 15});
  }
}
