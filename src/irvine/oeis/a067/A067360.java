package irvine.oeis.a067;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A067360 a(n) = 17^n sin(2n arctan(1/4)) or numerator of tan(2n arctan(1/4)).
 * @author Georg Fischer
 */
public class A067360 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A067360() {
    super(1, new long[] {0, 8},
      new long[] {1, -30, 289});
  }
}
