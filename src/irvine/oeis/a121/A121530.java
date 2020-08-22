package irvine.oeis.a121;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A121530 Number of double rises at an odd level in all nondecreasing Dyck paths of semilength n. A nondecreasing Dyck path is a Dyck path for which the sequence of the altitudes of the valleys is nondecreasing.
 * @author Georg Fischer
 */
public class A121530 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A121530() {
    super(1, new long[] {0, 0, 1, -2, -1, 4, -3},
      new long[] {1, -6, 9, 5, -15, 1, 4, -1});
  }
}
