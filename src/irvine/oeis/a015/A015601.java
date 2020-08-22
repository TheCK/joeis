package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015601 a(n) = 11*a(n-1) + 7*a(n-2).
 * @author Sean A. Irvine
 */
public class A015601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015601() {
    super(new long[] {7, 11}, new long[] {0, 1});
  }
}
