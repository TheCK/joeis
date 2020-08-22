package irvine.oeis.a087;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A087432 Expansion of 1+x*(1-x-4*x^2)/((1+x)*(1-2*x)*(1-3*x)).
 * @author Georg Fischer
 */
public class A087432 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A087432() {
    super(0, new long[] {1, -3, 0, 2},
      new long[] {1, -4, 1, 6});
  }
}
