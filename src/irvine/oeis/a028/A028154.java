package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A028154 Expansion of 1/((1-4x)(1-7x)(1-11x)(1-12x)).
 * @author Georg Fischer
 */
public class A028154 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028154() {
    super(0, new long[] {1},
      new long[] {1, -34, 413, -2096, 3696});
  }
}
