package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A028186 Expansion of 1/((1-5x)(1-7x)(1-9x)(1-12x)).
 * @author Georg Fischer
 */
public class A028186 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028186() {
    super(0, new long[] {1},
      new long[] {1, -33, 395, -2031, 3780});
  }
}
