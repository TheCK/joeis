package irvine.oeis.a301;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A301709 Partial sums of A301708.
 * @author Georg Fischer
 */
public class A301709 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A301709() {
    super(0, new long[] {1, 4, 1, 4, 1},
      new long[] {1, -3, 4, -4, 3, -1});
  }
}
