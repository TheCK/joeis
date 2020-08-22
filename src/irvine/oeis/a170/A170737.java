package irvine.oeis.a170;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A170737 Expansion of g.f.: (1+x)/(1-17*x).
 * @author Georg Fischer
 */
public class A170737 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A170737() {
    super(0, new long[] {1, 1},
      new long[] {1, -17});
  }
}
