package irvine.oeis.a170;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A170753 Expansion of g.f.: (1+x)/(1-33*x).
 * @author Georg Fischer
 */
public class A170753 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A170753() {
    super(0, new long[] {1, 1},
      new long[] {1, -33});
  }
}
