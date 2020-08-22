package irvine.oeis.a303;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A303812 Generalized 28-gonal (or icosioctagonal) numbers: m*(13*m - 12) with m = 0, +1, -1, +2, -2, +3, -3, ...
 * @author Georg Fischer
 */
public class A303812 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A303812() {
    super(0, new long[] {0, 1, 24, 1},
      new long[] {1, -1, -2, 2, 1, -1});
  }
}
