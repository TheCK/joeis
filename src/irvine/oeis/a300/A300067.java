package irvine.oeis.a300;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A300067 Period 6: repeat [0, 0, 0, 1, 2, 2].
 * @author Georg Fischer
 */
public class A300067 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A300067() {
    super(0, new long[] {0, 0, 0, 1, 2, 2},
      new long[] {1, 0, 0, 0, 0, 0, -1});
  }
}
