package irvine.oeis.a170;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A170743 Expansion of g.f.: (1+x)/(1-23*x).
 * @author Georg Fischer
 */
public class A170743 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A170743() {
    super(0, new long[] {1, 1},
      new long[] {1, -23});
  }
}
