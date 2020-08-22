package irvine.oeis.a128;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A128416 Expansion of (1-4x^2)/(1+4x+3x^2).
 * @author Georg Fischer
 */
public class A128416 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A128416() {
    super(0, new long[] {1, 0, -4},
      new long[] {1, 4, 3});
  }
}
