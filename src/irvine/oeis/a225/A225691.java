package irvine.oeis.a225;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A225691 Number of Dyck paths of semilength n avoiding the pattern U^4 D^4 U D.
 * @author Georg Fischer
 */
public class A225691 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A225691() {
    super(0, new long[] {1, -3, 4, -1, 3, 8, 12, 0, -20, 10},
      new long[] {1, -4, 6, -4, 1});
  }
}
