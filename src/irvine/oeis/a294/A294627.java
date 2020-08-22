package irvine.oeis.a294;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A294627 Expansion of x*(1 + x)/((1-2*x)*(1+x+x^2)).
 * @author Georg Fischer
 */
public class A294627 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A294627() {
    super(0, new long[] {0, 1, 1},
      new long[] {1, -1, -1, -2});
  }
}
