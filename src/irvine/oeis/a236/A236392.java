package irvine.oeis.a236;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A236392 G.f.: (x+x^3+x^4)/(1-x-x^3-2*x^4).
 * @author Georg Fischer
 */
public class A236392 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A236392() {
    super(0, new long[] {0, 1, 0, 1, 1},
      new long[] {1, -1, 0, -1, -2});
  }
}
