package irvine.oeis.a228;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A228279 Number of n X 4 binary arrays with top left value 1 and no two ones adjacent horizontally, vertically or nw-se diagonally.
 * @author Georg Fischer
 */
public class A228279 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A228279() {
    super(1, new long[] {0, 3, 3, -1, -7, 2},
      new long[] {1, -1, -10, -15, -4, 6, 1, -3, 1});
  }
}
