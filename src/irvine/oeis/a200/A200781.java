package irvine.oeis.a200;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A200781 G.f.: 1/(1-5*x+10*x^3-5*x^4).
 * @author Georg Fischer
 */
public class A200781 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A200781() {
    super(0, new long[] {1},
      new long[] {1, -5, 0, 10, -5});
  }
}
