package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140428 a(n) = A000045(n) + A113405(n).
 * @author Sean A. Irvine
 */
public class A140428 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140428() {
    super(new long[] {-2, -1, 3, -3, -1, 3}, new long[] {0, 1, 1, 3, 5, 9});
  }
}
