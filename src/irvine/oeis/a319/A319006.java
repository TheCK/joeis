package irvine.oeis.a319;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A319006 Sum of the next n positive integers repeated (A008619).
 * @author Georg Fischer
 */
public class A319006 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A319006() {
    super(1, new long[] {0, 1, -1, 3, -1, 1},
      new long[] {1, -4, 7, -8, 7, -4, 1});
  }
}
