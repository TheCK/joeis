package irvine.oeis.a320;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A320614 Expansion of (1 + x^5) / ((1 - x^2) * (1 - x^3) * (1 - x^7)) in powers of x.
 * @author Georg Fischer
 */
public class A320614 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A320614() {
    super(0, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1},
      new long[] {1, 0, -1, -1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, -1, -1, 0, 1});
  }
}
