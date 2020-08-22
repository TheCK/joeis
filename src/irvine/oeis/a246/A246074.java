package irvine.oeis.a246;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A246074 Paradigm Shift Sequence for a (-4,5) production scheme with replacement.
 * @author Georg Fischer
 */
public class A246074 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A246074() {
    super(1, new long[] {0, 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1},
      new long[] {1, 0, 0, 0, 0, 0, -2});
  }
}
