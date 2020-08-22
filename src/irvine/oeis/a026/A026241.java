package irvine.oeis.a026;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A026241 Expansion of 1/((1-2x)(1-5x)(1-10x)(1-12x)).
 * @author Georg Fischer
 */
public class A026241 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A026241() {
    super(0, new long[] {1},
      new long[] {1, -29, 284, -1060, 1200});
  }
}
