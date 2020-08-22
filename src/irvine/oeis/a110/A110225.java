package irvine.oeis.a110;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A110225 Expansion of (-1+3*x+2*x^2-8*x^3+3*x^5-2*x^6-2*x^7+x^8) / ((x-1)*(x+1)*(x^2-2*x-1)*(x^2+2*x-1)).
 * @author Georg Fischer
 */
public class A110225 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A110225() {
    super(0, new long[] {-1, 3, 2, -8, 0, 3, -2, -2, 1},
      new long[] {-1, 0, 7, 0, -7, 0, 1});
  }
}
