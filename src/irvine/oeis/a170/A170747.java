package irvine.oeis.a170;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A170747 Expansion of g.f.: (1+x)/(1-27*x).
 * @author Georg Fischer
 */
public class A170747 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A170747() {
    super(0, new long[] {1, 1},
      new long[] {1, -27});
  }
}
