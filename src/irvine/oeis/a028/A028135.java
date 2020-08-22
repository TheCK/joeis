package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A028135 Expansion of 1/((1-4x)(1-6x)(1-8x)(1-9x)).
 * @author Georg Fischer
 */
public class A028135 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028135() {
    super(0, new long[] {1},
      new long[] {1, -27, 266, -1128, 1728});
  }
}
