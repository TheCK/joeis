package irvine.oeis.a268;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A268945 Number of length-4 0..n arrays with no repeated value unequal to the previous repeated value plus one mod n+1.
 * @author Georg Fischer
 */
public class A268945 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A268945() {
    super(1, new long[] {0, 10, 13, 5, -5, 1},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
