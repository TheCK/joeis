package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A028010 Expansion of 1/((1-2x)(1-7x)(1-9x)(1-11x)).
 * @author Georg Fischer
 */
public class A028010 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028010() {
    super(0, new long[] {1},
      new long[] {1, -29, 293, -1171, 1386});
  }
}
