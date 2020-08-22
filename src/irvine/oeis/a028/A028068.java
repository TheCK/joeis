package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A028068 Expansion of 1/((1-3x)(1-5x)(1-9x)(1-10x)).
 * @author Georg Fischer
 */
public class A028068 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028068() {
    super(0, new long[] {1},
      new long[] {1, -27, 257, -1005, 1350});
  }
}
