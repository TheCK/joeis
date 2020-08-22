package irvine.oeis.a026;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A026326 Expansion of 1/((1-2x)(1-6x)(1-7x)(1-9x)).
 * @author Georg Fischer
 */
public class A026326 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A026326() {
    super(0, new long[] {1},
      new long[] {1, -24, 203, -696, 756});
  }
}
