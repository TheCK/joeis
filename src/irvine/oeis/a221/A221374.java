package irvine.oeis.a221;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A221374 Number of n X 2 arrays of occupancy after each element stays put or moves to some horizontal, vertical or antidiagonal neighbor, with no occupancy greater than 2.
 * @author Georg Fischer
 */
public class A221374 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A221374() {
    super(1, new long[] {0, 3, -8, 4},
      new long[] {1, -9, 12, -4});
  }
}
