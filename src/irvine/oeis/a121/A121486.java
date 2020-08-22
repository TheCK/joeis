package irvine.oeis.a121;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A121486 Number of peaks at even level in all nondecreasing Dyck paths of semilength n. A nondecreasing Dyck path is a Dyck path for which the sequence of the altitudes of the valleys is nondecreasing.
 * @author Georg Fischer
 */
public class A121486 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A121486() {
    super(1, new long[] {0, 0, 1, -2, -2, 6, -4, 1},
      new long[] {1, -6, 9, 5, -15, 1, 4, -1});
  }
}
