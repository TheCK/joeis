package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022983 27-n.
 * @author Sean A. Irvine
 */
public class A022983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022983() {
    super(new long[] {-1, 2}, new long[] {27, 26});
  }
}
