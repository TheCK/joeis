package irvine.oeis.a027;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A027635 Expansion of (1-x^8)*(1+x^5)/(1-x^2)^5.
 * @author Georg Fischer
 */
public class A027635 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A027635() {
    super(0, new long[] {1, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, -1},
      new long[] {1, 0, -5, 0, 10, 0, -10, 0, 5, 0, -1});
  }
}
