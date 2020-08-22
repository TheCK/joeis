package irvine.oeis.a160;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A160839 Expansion of (78+1116*x+3492*x^2+3237*x^3+927*x^4+72*x^5+x^6)/(1-x)^7.
 * @author Georg Fischer
 */
public class A160839 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A160839() {
    super(0, new long[] {78, 1116, 3492, 3237, 927, 72, 1},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
