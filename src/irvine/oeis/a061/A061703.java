package irvine.oeis.a061;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A061703 G.f.: 2*x*(2-2*x-3*x^2+2*x^3)/((1-3*x-x^2+x^3)*(1-x)).
 * @author Georg Fischer
 */
public class A061703 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A061703() {
    super(0, new long[] {0, 4, -4, -6, 4},
      new long[] {1, -4, 2, 2, -1});
  }
}
