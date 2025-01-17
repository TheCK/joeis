package irvine.oeis.a250;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A250340 Number of length 4+5 0..n arrays with every six consecutive terms having the maximum of some three terms equal to the minimum of the remaining three terms.
 * @author Georg Fischer
 */
public class A250340 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A250340() {
    super(1, new long[] {0, 172, 2861, 4335, -2703, -2357, 227, 65, -9, 1},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
