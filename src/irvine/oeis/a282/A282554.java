package irvine.oeis.a282;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A282554 Number of nX2 0..1 arrays with no 1 equal to more than two of its king-move neighbors, with the exception of exactly one element.
 * @author Georg Fischer
 */
public class A282554 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A282554() {
    super(1, new long[] {0, 0, 0, 10, -24, 8},
      new long[] {1, -6, 7, 2, 29, -44, -12, -32, 64});
  }
}
