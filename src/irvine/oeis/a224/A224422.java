package irvine.oeis.a224;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A224422 Expansion of (1-x)*(1-3*x)/(1-9*x+28*x^2-35*x^3+15*x^4-x^5).
 * @author Georg Fischer
 */
public class A224422 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A224422() {
    super(0, new long[] {1, -4, 3},
      new long[] {1, -9, 28, -35, 15, -1});
  }
}
