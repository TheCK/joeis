package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A028152 Expansion of 1/((1-4x)(1-7x)(1-10x)(1-11x)).
 * @author Georg Fischer
 */
public class A028152 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028152() {
    super(0, new long[] {1},
      new long[] {1, -32, 369, -1798, 3080});
  }
}
