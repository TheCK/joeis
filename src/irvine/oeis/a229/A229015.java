package irvine.oeis.a229;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A229015 Number of arrays of median of three adjacent elements of some length 7 0..n array, with no adjacent equal elements in the latter.
 * @author Georg Fischer
 */
public class A229015 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A229015() {
    super(1, new long[] {0, 2, 45, 20, -32, 2, 1},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
