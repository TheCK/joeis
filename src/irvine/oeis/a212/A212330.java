package irvine.oeis.a212;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A212330 Expansion of  x^5*(1 - x)^2*(4 - 14*x + 8*x^2 + 11*x^3 - 6*x^4 - 2*x^5 + 2*x^6 + 5*x^7 - 2*x^8 + x^9)/(1 - 2*x)^4.
 * @author Georg Fischer
 */
public class A212330 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A212330() {
    super(0, new long[] {0, 0, 0, 0, 0, 4, -22, 40, -19, -20, 21, 0, -1, -10, 10, -4, 
      1},
      new long[] {1, -8, 24, -32, 16});
  }
}
