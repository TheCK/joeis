package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033443 Number of edges in 11-partite Tur\u00e1n graph of order n.
 * @author Sean A. Irvine
 */
public class A033443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033443() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 65});
  }
}
