package irvine.oeis.a091;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A091004 Expansion of x*(1-x)/((1-2*x)*(1+3*x)).
 * @author Georg Fischer
 */
public class A091004 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A091004() {
    super(0, new long[] {0, 1, -1},
      new long[] {1, 1, -6});
  }
}
