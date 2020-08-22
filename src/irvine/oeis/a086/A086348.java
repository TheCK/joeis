package irvine.oeis.a086;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A086348 On a 3 X 3 board, number of n-move routes of chess king ending in the central square.
 * @author Georg Fischer
 */
public class A086348 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A086348() {
    super(0, new long[] {1, 6, 4},
      new long[] {1, -2, -12, -8});
  }
}
