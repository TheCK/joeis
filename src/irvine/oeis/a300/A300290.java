package irvine.oeis.a300;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A300290 Period 6: repeat [0, 1, 2, 2, 3, 3].
 * @author Georg Fischer
 */
public class A300290 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A300290() {
    super(0, new long[] {0, 1, 2, 2, 3, 3},
      new long[] {1, 0, 0, 0, 0, 0, -1});
  }
}
