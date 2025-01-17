package irvine.oeis.a109;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A109247 Expansion of (1 - 3*x^2 - 3*x^3 + x^4)/(1 + x^4).
 * @author Georg Fischer
 */
public class A109247 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A109247() {
    super(0, new long[] {1, 0, -3, -3, 1},
      new long[] {1, 0, 0, 0, 1});
  }
}
