package irvine.oeis.a254;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A254701 Number of length 3+4 0..n arrays with every five consecutive terms having the maximum of some two terms equal to the minimum of the remaining three terms.
 * @author Georg Fischer
 */
public class A254701 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A254701() {
    super(1, new long[] {0, 54, 174, 34, -139, 27, -7, 1},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
