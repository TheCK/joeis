package irvine.oeis.a110;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A110164 Expansion of (1-x^2)/(1+2x).
 * @author Georg Fischer
 */
public class A110164 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A110164() {
    super(0, new long[] {1, 0, -1},
      new long[] {1, 2});
  }
}
