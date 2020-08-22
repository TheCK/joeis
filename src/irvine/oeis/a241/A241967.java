package irvine.oeis.a241;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A241967 Number of length 4+3 0..n arrays with no consecutive four elements summing to more than 2*n.
 * @author Georg Fischer
 */
public class A241967 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A241967() {
    super(1, new long[] {0, 57, 319, 607, 140, 70, -28, 8, -1},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
