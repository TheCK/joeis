package irvine.oeis.a184;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A184063 Number of (n+1) X 2 binary arrays with rows and columns in nondecreasing order and with no 2 X 2 subblock sum differing from a horizontal or vertical neighbor subblock sum by more than one.
 * @author Georg Fischer
 */
public class A184063 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A184063() {
    super(1, new long[] {0, 7, -17, 18, -8, 1},
      new long[] {1, -4, 6, -4, 1});
  }
}
