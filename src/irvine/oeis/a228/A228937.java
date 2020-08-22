package irvine.oeis.a228;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A228937 Expansion of (1+2*x+30*x^2+13*x^3-13*x^5-30*x^6-2*x^7-x^8)/(1+2*x^4+x^8).
 * @author Georg Fischer
 */
public class A228937 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A228937() {
    super(0, new long[] {1, 2, 30, 13, 0, -13, -30, -2, -1},
      new long[] {1, 0, 0, 0, 2, 0, 0, 0, 1});
  }
}
