package irvine.oeis.a092;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A092804 Expansion of (1+10x)/((1-1000x^3)).
 * @author Georg Fischer
 */
public class A092804 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A092804() {
    super(0, new long[] {1, 10},
      new long[] {1, 0, 0, -1000});
  }
}
