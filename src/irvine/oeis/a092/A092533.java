package irvine.oeis.a092;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A092533 G.f.: (1+x^8)/((1-x)*(1-x^4)).
 * @author Georg Fischer
 */
public class A092533 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A092533() {
    super(0, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 1},
      new long[] {1, -1, 0, 0, -1, 1});
  }
}
