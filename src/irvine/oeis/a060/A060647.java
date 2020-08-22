package irvine.oeis.a060;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A060647 Number of alpha-beta evaluations in a tree of depth n and branching factor b=3.
 * @author Georg Fischer
 */
public class A060647 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A060647() {
    super(0, new long[] {1, 2, -1},
      new long[] {1, -1, -3, 3});
  }
}
