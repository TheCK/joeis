package irvine.oeis.a219;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A219757 Expansion of x^4*(2-7*x+6*x^2+x^3-x^4)/((1-x)*(1-2*x)^4*(1-3*x+x^2)).
 * @author Georg Fischer
 */
public class A219757 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A219757() {
    super(0, new long[] {0, 0, 0, 0, 2, -7, 6, 1, -1},
      new long[] {1, -12, 60, -161, 248, -216, 96, -16});
  }
}
