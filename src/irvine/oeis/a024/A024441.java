package irvine.oeis.a024;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A024441 Expansion of 1/((1-x)(1-7x)(1-9x)(1-10x)).
 * @author Georg Fischer
 */
public class A024441 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A024441() {
    super(0, new long[] {1},
      new long[] {1, -27, 249, -853, 630});
  }
}
