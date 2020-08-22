package irvine.oeis.a097;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A097921 G.f.: (1-x^6)*(1-x^8)/((1-x)*(1-x^2)*(1-x^3)^2*(1-x^4)).
 * @author Georg Fischer
 */
public class A097921 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A097921() {
    super(0, new long[] {1, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 1},
      new long[] {1, -1, -1, -1, 1, 3, 0, 0, -3, -1, 1, 1, 1, -1});
  }
}
