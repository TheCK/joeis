package irvine.oeis.a038;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A038846 4-fold convolution of A000302 (powers of 4); expansion of 1/(1-4*x)^4.
 * @author Georg Fischer
 */
public class A038846 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A038846() {
    super(0, new long[] {1},
      new long[] {1, -16, 96, -256, 256});
  }
}
