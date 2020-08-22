package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047439 Numbers that are congruent to {0, 1, 5, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047439() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 5, 6, 8});
  }
}
