package irvine.oeis.a170;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A170766 Expansion of g.f.: (1+x)/(1-46*x).
 * @author Georg Fischer
 */
public class A170766 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A170766() {
    super(0, new long[] {1, 1},
      new long[] {1, -46});
  }
}
