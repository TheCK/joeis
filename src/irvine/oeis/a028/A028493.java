package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A028493 a(0) = 16, a(n+1) = 3a(n) - (6-n)^2.
 * @author Georg Fischer
 */
public class A028493 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028493() {
    super(0, new long[] {16, -84, 131, -65},
      new long[] {1, -6, 12, -10, 3});
  }
}
