package irvine.oeis.a211;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A211899 Number of triangular n X n X n arrays colored with integers 0 upwards introduced in row major order, with no element equal to any neighbor, and containing the value n(n+1)/2-2.
 * @author Georg Fischer
 */
public class A211899 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A211899() {
    super(1, new long[] {0, 0, 1, 2, 3, -4, 1},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
