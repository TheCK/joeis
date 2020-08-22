package irvine.oeis.a221;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A221464 Number of 0..n arrays of length 5 with each element unequal to at least one neighbor, starting with 0.
 * @author Georg Fischer
 */
public class A221464 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A221464() {
    super(1, new long[] {0, 3, 17, 5, -1},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
