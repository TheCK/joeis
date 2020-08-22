package irvine.oeis.a117;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A117439 Expansion of (1-x^2)/(1-4x-2x^2+x^4).
 * @author Georg Fischer
 */
public class A117439 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A117439() {
    super(0, new long[] {1, 0, -1},
      new long[] {1, -4, -2, 0, 1});
  }
}
