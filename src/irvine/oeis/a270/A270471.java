package irvine.oeis.a270;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A270471 Expansion of (1-3*x)/(1-7*x).
 * @author Georg Fischer
 */
public class A270471 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A270471() {
    super(0, new long[] {1, -3},
      new long[] {1, -7});
  }
}
