package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A269682 Number of length-7 0..n arrays with no repeated value differing from the previous repeated value by other than plus or minus one modulo n+1.
 * @author Georg Fischer
 */
public class A269682 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A269682() {
    super(1, new long[] {0, 30, 966, 1892, 3518, -2026, 1234, -752, 202, -24},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
