package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A028089 Expansion of 1/((1-3x)(1-7x)(1-8x)(1-9x)).
 * @author Georg Fischer
 */
public class A028089 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028089() {
    super(0, new long[] {1},
      new long[] {1, -27, 263, -1077, 1512});
  }
}
