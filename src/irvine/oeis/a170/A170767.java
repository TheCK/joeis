package irvine.oeis.a170;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A170767 Expansion of g.f.: (1+x)/(1-47*x).
 * @author Georg Fischer
 */
public class A170767 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A170767() {
    super(0, new long[] {1, 1},
      new long[] {1, -47});
  }
}
