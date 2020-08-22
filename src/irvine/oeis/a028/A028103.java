package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A028103 Expansion of 1/((1-3x)(1-8x)(1-10x)(1-12x)).
 * @author Georg Fischer
 */
public class A028103 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028103() {
    super(0, new long[] {1},
      new long[] {1, -33, 386, -1848, 2880});
  }
}
