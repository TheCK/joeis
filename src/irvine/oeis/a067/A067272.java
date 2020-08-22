package irvine.oeis.a067;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A067272 2*10^(n-1)-1.
 * @author Georg Fischer
 */
public class A067272 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A067272() {
    super(1, new long[] {0, 1, 8},
      new long[] {1, -11, 10});
  }
}
