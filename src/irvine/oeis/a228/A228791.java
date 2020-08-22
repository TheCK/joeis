package irvine.oeis.a228;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A228791 Number of n X 3 binary arrays with top left element equal to 1 and no two ones adjacent horizontally or nw-se.
 * @author Georg Fischer
 */
public class A228791 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A228791() {
    super(1, new long[] {0, 2, -2, 2},
      new long[] {1, -5, 3});
  }
}
