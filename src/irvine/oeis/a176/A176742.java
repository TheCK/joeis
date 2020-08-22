package irvine.oeis.a176;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A176742 Expansion of (1 - x^2) / (1 + x^2) in powers of x.
 * @author Georg Fischer
 */
public class A176742 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A176742() {
    super(0, new long[] {1, 0, -1},
      new long[] {1, 0, 1});
  }
}
