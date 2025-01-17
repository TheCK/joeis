package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164412 Number of binary strings of length n with no substrings equal to 0000 0001 or 0111.
 * @author Sean A. Irvine
 */
public class A164412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164412() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {13, 22, 37, 60, 98});
  }
}
