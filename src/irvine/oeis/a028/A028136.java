package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A028136 Expansion of 1/((1-4x)(1-6x)(1-8x)(1-10x)).
 * @author Georg Fischer
 */
public class A028136 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028136() {
    super(0, new long[] {1},
      new long[] {1, -28, 284, -1232, 1920});
  }
}
