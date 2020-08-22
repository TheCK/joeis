package irvine.oeis.a147;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A147622 G.f.: 1/(1 - x - 2 x^2 + x^3 + x^4 + 2 x^7 - 5 x^9 + 2 x^11 + x^14 + x^15 - 2 x^16 - x^17 + x^18).
 * @author Georg Fischer
 */
public class A147622 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A147622() {
    super(0, new long[] {1},
      new long[] {1, -1, -2, 1, 1, 0, 0, 2, 0, -5, 0, 2, 0, 0, 1, 1, -2, -1, 
      1});
  }
}
