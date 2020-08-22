package irvine.oeis.a268;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A268244 G.f.: (1 + x + 3*x^2 + 11*x^3 + 6*x^4 + 14*x^5 + 12*x^6 + 4*x^7 + 14*x^8 + 4*x^9 + 12*x^10 + 14*x^11 + 5*x^ 12 + 11*x^13 + 9*x^14 - 11*x^15)/((1 - x)^4*(1 - x^2)^12).
 * @author Georg Fischer
 */
public class A268244 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A268244() {
    super(0, new long[] {1, 1, 3, 11, 6, 14, 12, 4, 14, 4, 12, 14, 5, 11, 9, -11},
      new long[] {1, -4, -6, 44, -5, -216, 164, 616, -759, -1100, 1958, 1188, -3333, 
      -528, 3960, -528, -3333, 1188, 1958, -1100, -759, 616, 164, -216, 
      -5, 44, -6, -4, 1});
  }
}
