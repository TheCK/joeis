package irvine.oeis.a233;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A233077 Number of n X 3 0..3 arrays with no element x(i,j) adjacent to value 3-x(i,j) horizontally or antidiagonally, top left element zero, and 1 appearing before 2 in row major order.
 * @author Georg Fischer
 */
public class A233077 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A233077() {
    super(1, new long[] {0, 5, -15},
      new long[] {1, -22, 21});
  }
}
