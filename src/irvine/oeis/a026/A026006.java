package irvine.oeis.a026;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A026006 Expansion of 1/((1-2x)(1-5x)(1-8x)(1-12x)).
 * @author Georg Fischer
 */
public class A026006 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A026006() {
    super(0, new long[] {1},
      new long[] {1, -27, 246, -872, 960});
  }
}
