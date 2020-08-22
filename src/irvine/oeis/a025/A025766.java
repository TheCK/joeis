package irvine.oeis.a025;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A025766 Expansion of 1/((1-x)(1-x^2)(1-x^11)).
 * @author Georg Fischer
 */
public class A025766 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A025766() {
    super(0, new long[] {1},
      new long[] {1, -1, -1, 1, 0, 0, 0, 0, 0, 0, 0, -1, 1, 1, -1});
  }
}
