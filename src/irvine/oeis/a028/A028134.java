package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A028134 Expansion of 1/((1-4x)(1-6x)(1-7x)(1-12x)).
 * @author Georg Fischer
 */
public class A028134 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028134() {
    super(0, new long[] {1},
      new long[] {1, -29, 298, -1296, 2016});
  }
}
