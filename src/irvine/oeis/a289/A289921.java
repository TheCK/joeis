package irvine.oeis.a289;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A289921 Coefficients of 1/([1+r] - [1+2r]x + [1+3r]x^2 - ...), where [ ] = floor and r = 9/10.
 * @author Georg Fischer
 */
public class A289921 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A289921() {
    super(0, new long[] {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1},
      new long[] {1, -1, 1, -1, 1, -1, 1, -1, 1, -1, -1});
  }
}
