package irvine.oeis.a302;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A302118 Number of permutations p of [n] such that |p(i) - p(i-1)| is in {1,3} for all i from 2 to n.
 * @author Georg Fischer
 */
public class A302118 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A302118() {
    super(0, new long[] {1, 0, -2, -1, 3, 4, 6, -6, -10, -6, 2, 6, 3, 0, -2, -3, 1},
      new long[] {1, -1, -3, 2, 1, 1, 3, -1, -1, -3, -1, -1, 0, 2, 0, 1});
  }
}
