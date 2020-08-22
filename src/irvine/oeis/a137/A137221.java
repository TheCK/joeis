package irvine.oeis.a137;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A137221 a(n) = 5*a(n-1) - 9*a(n-2) + 8*a(n-3) - 4*a(n-4).
 * @author Georg Fischer
 */
public class A137221 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A137221() {
    super(0, new long[] {0, 0, 0, 1},
      new long[] {1, -5, 9, -8, 4});
  }
}
