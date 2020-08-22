package irvine.oeis.a123;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A123887 Expansion of g.f.: (1+x+x^2)/(1-5*x-5*x^2).
 * @author Georg Fischer
 */
public class A123887 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A123887() {
    super(0, new long[] {1, 1, 1},
      new long[] {1, -5, -5});
  }
}
