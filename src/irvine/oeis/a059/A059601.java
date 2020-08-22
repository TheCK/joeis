package irvine.oeis.a059;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A059601 Expansion of (1+10*x+5*x^2)/(1-x)^10.
 * @author Georg Fischer
 */
public class A059601 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A059601() {
    super(0, new long[] {1, 10, 5},
      new long[] {1, -10, 45, -120, 210, -252, 210, -120, 45, -10, 1});
  }
}
