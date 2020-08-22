package irvine.oeis.a262;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A262242 Triangular numbers representable as 2^x + 2^y.
 * @author Georg Fischer
 */
public class A262242 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A262242() {
    super(1, new long[] {0, 3, -12, -2, 24, -70, 28, 240},
      new long[] {1, -6, 8});
  }
}
