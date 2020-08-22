package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A028070 Expansion of 1/((1-3x)(1-5x)(1-9x)(1-12x)).
 * @author Georg Fischer
 */
public class A028070 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028070() {
    super(0, new long[] {1},
      new long[] {1, -29, 291, -1179, 1620});
  }
}
