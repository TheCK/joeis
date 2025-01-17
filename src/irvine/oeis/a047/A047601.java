package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047601 Numbers that are congruent to {0, 1, 3, 4, 5} mod 8.
 * @author Sean A. Irvine
 */
public class A047601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047601() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 3, 4, 5, 8});
  }
}
