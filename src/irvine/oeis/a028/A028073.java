package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A028073 Expansion of 1/((1-3x)(1-5x)(1-11x)(1-12x)).
 * @author Georg Fischer
 */
public class A028073 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028073() {
    super(0, new long[] {1},
      new long[] {1, -31, 331, -1401, 1980});
  }
}
