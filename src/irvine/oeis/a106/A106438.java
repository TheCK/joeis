package irvine.oeis.a106;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A106438 G.f.: x(2-5x-2x^2)/(1-6x+9x^2-x^4).
 * @author Georg Fischer
 */
public class A106438 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A106438() {
    super(0, new long[] {0, 2, -5, -2},
      new long[] {1, -6, 9, 0, -1});
  }
}
