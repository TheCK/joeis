package irvine.oeis.a030;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A030978 Maximal number of non-attacking knights on an n X n board.
 * @author Georg Fischer
 */
public class A030978 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A030978() {
    super(0, new long[] {0, -1, -2, 3, 0, -4, 2},
      new long[] {-1, 2, 0, -2, 1});
  }
}
