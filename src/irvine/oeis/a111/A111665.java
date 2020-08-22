package irvine.oeis.a111;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A111665 Expansion of (-1+x+2*x^2+5*x^4+3*x^3) / ((x-1)*(x+1)*(x^2-3*x+1)*(1+x^2)).
 * @author Georg Fischer
 */
public class A111665 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A111665() {
    super(0, new long[] {-1, 1, 2, 3, 5},
      new long[] {-1, 3, -1, 0, 1, -3, 1});
  }
}
