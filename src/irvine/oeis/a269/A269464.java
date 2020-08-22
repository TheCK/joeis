package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A269464 Number of length-n 0..5 arrays with no repeated value equal to the previous repeated value.
 * @author Georg Fischer
 */
public class A269464 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A269464() {
    super(1, new long[] {0, 6, -18, -54},
      new long[] {1, -9, 10, 50});
  }
}
