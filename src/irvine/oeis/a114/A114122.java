package irvine.oeis.a114;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A114122 Expansion of (1+x)^2/(1+2x-4x^3-4x^4).
 * @author Georg Fischer
 */
public class A114122 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A114122() {
    super(0, new long[] {1, 2, 1},
      new long[] {1, 2, 0, -4, -4});
  }
}
